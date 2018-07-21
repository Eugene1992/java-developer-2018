CREATE TABLE contact (

);

DROP TABLE contact;

CREATE TABLE contact (
  contact_id SERIAL PRIMARY KEY,
  first_name VARCHAR(64) NOT NULL,
  last_name  TEXT,
  birthday   DATE,
  phone      INTEGER,
  city       VARCHAR(64),
  country    VARCHAR(64)
);

ALTER TABLE contact
  ALTER COLUMN last_name TYPE VARCHAR(64);

ALTER TABLE contact
  ALTER COLUMN last_name SET NOT NULL;

INSERT INTO contact VALUES (1, 'Alex', 'Alexsov', '1993-01-11', 0112223344, 'Kyiv', 'Ukraine');
INSERT INTO contact VALUES (2, 'Emma', 'Emmasov', '1993-02-13', 0112223344, 'Nicosia', 'Cyprus');
INSERT INTO contact VALUES (3, 'Jacob', 'Jacobsov', '1993-03-16', 0112223344, 'Prague', 'Czech Republic');
INSERT INTO contact VALUES (4, 'Olivia', 'Oliviasov', '1993-04-09', 0112223344, 'Copenhagen', 'Denmark');
INSERT INTO contact VALUES (5, 'Michael', 'Michaelsov', '1993-05-05', 0112223344, 'Cairo', 'Egypt');
INSERT INTO contact VALUES (6, 'Isabella', 'Isabellaxsov', '1993-06-30', 0112223344, 'Tbilisi', 'Georgia');
INSERT INTO contact VALUES (7, 'Joshua', 'Joshuasov', '1993-07-21', 0112223344, 'Athens', 'Greece');
INSERT INTO contact VALUES (8, 'Samantha', 'Samanthasov', '1993-08-29', 0112223344, 'Honolulu', 'Hawaii');
INSERT INTO contact VALUES (9, 'Matthew', 'Matthewsov', '1993-09-10', 0112223344, 'Rome', 'Italy');
INSERT INTO contact VALUES (10, 'Alyssa', 'Alyssasov', '1993-10-20', 0112223344, 'Tokyo', 'Japan');

ALTER TABLE contact
  ADD COLUMN gender VARCHAR(64);

UPDATE contact SET gender = 'female' WHERE first_name LIKE '%a';
UPDATE contact SET gender = 'male' WHERE gender IS NULL;

ALTER TABLE contact
  ADD COLUMN rating INT;

ALTER TABLE contact
  ADD CHECK (contact.rating > 0);