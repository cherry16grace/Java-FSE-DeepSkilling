SET SERVEROUTPUT ON;


DECLARE


CURSOR account_cursor IS

SELECT AccountID,Balance

FROM Accounts;



BEGIN


FOR acc IN account_cursor


LOOP


UPDATE Accounts

SET Balance =
Balance - 500

WHERE AccountID =
acc.AccountID;



END LOOP;



COMMIT;



DBMS_OUTPUT.PUT_LINE(
'Annual Fee Applied'
);



END;
/