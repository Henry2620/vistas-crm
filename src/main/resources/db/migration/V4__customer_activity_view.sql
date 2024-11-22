CREATE VIEW customer_activity_view AS
SELECT
    c.id AS customer_id,
    c.name AS customer_name,
    a.activity_id AS activity_id,
    a.description AS activity_name,
    a.activity_date AS activity_date
FROM
    customer c
        JOIN
    lead l ON c.id = l.customer_id
        JOIN
    activity a ON l.lead_id = a.lead_id;
