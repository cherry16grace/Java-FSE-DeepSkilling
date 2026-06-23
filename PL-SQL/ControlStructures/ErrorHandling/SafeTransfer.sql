CREATE OR REPLACE PROCEDURE SafeTransferFunds
(
    from_acc NUMBER,
    to_acc NUMBER,
    amount NUMBER
)

AS

source_balance NUMBER;


BEGIN


SELECT Balance
INTO source_balance
FROM Accounts
WHERE AccountID = from_acc;



IF source_balance < amount THEN


RAISE_APPLICATION_ERROR(
-20001,
'Insufficient Balance'
);


END IF;



UPDATE Accounts

SET Balance =
Balance - amount

WHERE AccountID = from_acc;



UPDATE Accounts

SET Balance =
Balance + amount

WHERE AccountID = to_acc;



COMMIT;



DBMS_OUTPUT.PUT_LINE(
'Transfer Successful'
);



EXCEPTION


WHEN OTHERS THEN


ROLLBACK;


INSERT INTO ErrorLog
(ErrorMessage,ErrorDate)

VALUES
(SQLERRM,SYSDATE);



COMMIT;



DBMS_OUTPUT.PUT_LINE(
'Transfer Failed : '
||SQLERRM
);


END;
/