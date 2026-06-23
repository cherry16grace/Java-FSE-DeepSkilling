CREATE OR REPLACE PACKAGE CustomerManagement

AS


PROCEDURE AddCustomer
(
id NUMBER,
name VARCHAR2,
balance NUMBER
);



PROCEDURE UpdateCustomer
(
id NUMBER,
newName VARCHAR2
);



FUNCTION GetCustomerBalance
(
id NUMBER
)

RETURN NUMBER;



END CustomerManagement;
/