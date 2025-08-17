-- First insert Users
INSERT INTO "app_users" (user_id, name, email, password, registered_at)
VALUES ('U1', 'Alice Smith', 'alice@example.com', 'pass123', CURRENT_TIMESTAMP);

INSERT INTO "app_users" (user_id, name, email, password, registered_at)
VALUES ('U2', 'Bob Johnson', 'bob@example.com', 'pass456', CURRENT_TIMESTAMP);

-- Then insert Transactions
INSERT INTO "app_transactions" (
    tnx_id, sender_id, receiver_id, amount, tnx_type, tnx_status, tnx_date, tnx_channel, rewards_earned
) VALUES (
    'T1', 'U1', 'U2', 250.00, 'TRANSFER', 'SUCCESS', CURRENT_TIMESTAMP, 'MOBILE_APP', 25
);

INSERT INTO "app_transactions" (
    tnx_id, sender_id, receiver_id, amount, tnx_type, tnx_status, tnx_date, tnx_channel, rewards_earned
) VALUES (
    'T2', 'U2', 'U1', 120.50, 'TRANSFER', 'PENDING', CURRENT_TIMESTAMP, 'WEB_PORTAL', 10
);
