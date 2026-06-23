CREATE TABLE Customers
(
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(50),
    Balance NUMBER,
    LastModified DATE
);



CREATE TABLE Transactions
(
    TransactionID NUMBER PRIMARY KEY,
    AccountID NUMBER,
    TransactionDate DATE,
    Amount NUMBER,
    TransactionType VARCHAR2(20)
);



CREATE TABLE AuditLog
(
    LogID NUMBER GENERATED ALWAYS AS IDENTITY,
    TransactionID NUMBER,
    Message VARCHAR2(200),
    LogDate DATE
);