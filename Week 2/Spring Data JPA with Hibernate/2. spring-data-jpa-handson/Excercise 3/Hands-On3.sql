CREATE DATABASE IF NOT EXISTS ormlearn_ex3;

USE ormlearn_ex3;

CREATE TABLE country (
    co_code VARCHAR(2) PRIMARY KEY,
    co_name VARCHAR(50)
);

INSERT INTO country VALUES ('IN', 'India');
INSERT INTO country VALUES ('US', 'United States');
INSERT INTO country VALUES ('UK', 'United Kingdom');
INSERT INTO country VALUES ('AU', 'Australia');
INSERT INTO country VALUES ('CA', 'Canada');
INSERT INTO country VALUES ('FR', 'France');
INSERT INTO country VALUES ('DE', 'Germany');
INSERT INTO country VALUES ('JP', 'Japan');
INSERT INTO country VALUES ('CN', 'China');
INSERT INTO country VALUES ('ZA', 'South Africa');

SELECT * FROM country;