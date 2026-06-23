CREATE TABLE Accounts
(
    AccountID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    Balance NUMBER
);



CREATE TABLE Employees
(
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(50),
    Salary NUMBER
);



CREATE TABLE ErrorLog
(
    ErrorID NUMBER GENERATED ALWAYS AS IDENTITY,
    ErrorMessage VARCHAR2(200),
    ErrorDate DATE
);