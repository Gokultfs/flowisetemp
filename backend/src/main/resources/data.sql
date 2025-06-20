INSERT INTO customers (id, name, email, segment, is_duplicate, journey_started) VALUES
(1, 'John Doe', 'john.doe@example.com', 'C1', FALSE, FALSE),2, 'Jane Smith', 'jane.smith@example.com', 'C2', FALSE, FALSE),
(3, 'John Doe', 'john.doe@example.com', 'C1', TRUE, FALSE),
(4, 'Peter Jones', 'peter.jones@example.com', 'C3', FALSE, FALSE);
INSERT INTO offers (id, customer_id, offer_details, status) VALUES
(101, 1, 'Pre-approved Loan Offer A', 'PRE_APPROVED'),
(102, 2, 'Credit Card Offer B', 'APPROVED');
