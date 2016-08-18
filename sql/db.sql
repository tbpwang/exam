DROP DATABASE IF EXISTS exam;
CREATE DATABASE exam;

# user table
DROP TABLE IF EXISTS exam.user;
CREATE TABLE exam.user(
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
  username VARCHAR(255) UNIQUE,
  password VARCHAR(255),
  role VARCHAR(255) DEFAULT 'admin'
);


INSERT INTO exam.user(username, password) VALUES ('admin', 123);

SELECT *
FROM exam.user;