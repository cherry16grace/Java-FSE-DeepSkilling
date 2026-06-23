CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest

AS


BEGIN


UPDATE SavingsAccounts

SET Balance =
Balance + (Balance * 0.01);



COMMIT;



DBMS_OUTPUT.PUT_LINE(
'Monthly Interest Processed'
);



END;
/