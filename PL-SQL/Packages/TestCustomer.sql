SET SERVEROUTPUT ON;


BEGIN


CustomerManagement.AddCustomer
(
2,
'David',
8000
);



CustomerManagement.UpdateCustomer
(
1,
'John Updated'
);



DBMS_OUTPUT.PUT_LINE(

CustomerManagement.GetCustomerBalance(1)

);



END;
/