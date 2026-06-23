BEGIN


FOR customer IN
(
SELECT CustomerID,DOB
FROM Customers
)

LOOP


IF MONTHS_BETWEEN(
SYSDATE,
customer.DOB
)/12 > 60

THEN


UPDATE Loans

SET InterestRate =
InterestRate - 1

WHERE CustomerID =
customer.CustomerID;



END IF;


END LOOP;



COMMIT;



DBMS_OUTPUT.PUT_LINE(
'Interest discount applied'
);


END;
/