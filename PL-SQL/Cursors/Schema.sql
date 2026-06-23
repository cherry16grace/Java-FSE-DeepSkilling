
CREATE TABLE Customers
(
CustomerID NUMBER PRIMARY KEY,
Name VARCHAR2(50)
);



CREATE TABLE Transactions
(
TransactionID NUMBER PRIMARY KEY,
CustomerID NUMBER,
TransactionDate DATE,
Amount NUMBER,
TransactionType VARCHAR2(20)
);



CREATE TABLE Accounts
(
AccountID NUMBER PRIMARY KEY,
CustomerID NUMBER,
Balance NUMBER
);



CREATE TABLE Loans
(
LoanID NUMBER PRIMARY KEY,
CustomerID NUMBER,
InterestRate NUMBER
);