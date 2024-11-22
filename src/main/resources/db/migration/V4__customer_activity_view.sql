CREATE VIEW activity_view AS
SELECT
    a.*,
    l.name
FROM
    activity a
        JOIN
    lead l ON l.lead_id = a.lead_id

