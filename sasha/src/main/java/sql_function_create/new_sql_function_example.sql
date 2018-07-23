CREATE OR REPLACE FUNCTION summary_active_salary() RETURNS double precision AS
$$
SELECT sum(price) FROM product_21072018 WHERE active = TRUE;
$$ LANGUAGE SQL;
