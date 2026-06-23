INSERT INTO Customers
VALUES
(
1,
'John',
5000,
SYSDATE
);



INSERT INTO Transactions
VALUES
(
101,
1,
SYSDATE,
1000,
'Deposit'
);



COMMIT;