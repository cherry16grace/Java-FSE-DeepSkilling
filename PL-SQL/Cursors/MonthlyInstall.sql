SET SERVEROUTPUT ON;


DECLARE


CURSOR transaction_cursor IS

SELECT CustomerID,
Amount,
TransactionType

FROM Transactions

WHERE EXTRACT(
MONTH FROM TransactionDate
)
=
EXTRACT(
MONTH FROM SYSDATE
);



BEGIN


FOR transaction_record
IN transaction_cursor


LOOP


DBMS_OUTPUT.PUT_LINE(

'Customer : '
||transaction_record.CustomerID
||
' Amount : '
||transaction_record.Amount
||
' Type : '
||transaction_record.TransactionType

);


END LOOP;



END;
/