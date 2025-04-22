CREATE DATABASE sports_federation;

USE sports_federation;

CREATE TABLE licensees (
    license_number INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    sport VARCHAR(100) NOT NULL
);
