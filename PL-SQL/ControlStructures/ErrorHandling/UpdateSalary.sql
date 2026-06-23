CREATE OR REPLACE PROCEDURE UpdateSalary
(
 emp_id NUMBER,
 percentage NUMBER
)

AS

BEGIN


UPDATE Employees

SET Salary =
Salary + 
(Salary * percentage/100)

WHERE EmployeeID=emp_id;



IF SQL%ROWCOUNT = 0 THEN


RAISE_APPLICATION_ERROR(
-20002,
'Employee Not Found'
);


END IF;



COMMIT;


DBMS_OUTPUT.PUT_LINE(
'Salary Updated'
);



EXCEPTION


WHEN OTHERS THEN


INSERT INTO ErrorLog
(ErrorMessage,ErrorDate)

VALUES
(SQLERRM,SYSDATE);



COMMIT;


DBMS_OUTPUT.PUT_LINE(
'Error : '
||SQLERRM
);



END;
/