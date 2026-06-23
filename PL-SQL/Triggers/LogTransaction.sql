CREATE OR REPLACE TRIGGER LogTransaction

AFTER INSERT

ON Transactions

FOR EACH ROW


BEGIN



INSERT INTO AuditLog
(
TransactionID,
Message,
LogDate
)

VALUES
(
:NEW.TransactionID,
'New Transaction Added',
SYSDATE
);



END;
/