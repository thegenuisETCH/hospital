CREATE TABLE employee (
  id int NOT NULL PRIMARY KEY,
  first text NOT NULL,
  last text NOT NULL,
  address varchar(45) NOT NULL,
  city text NOT NULL,
  gender text NOT NULL,
  birthdate varchar(45) NOT NULL,
  identification varchar(45) NOT NULL,
  phone varchar(20) NOT NULL,
  type text NOT NULL,
  department text NOT NULL,
  email varchar(50) NOT NULL,
  password varchar(42) NOT NULL
)


CREATE TABLE users (
  id int NOT NULL PRIMARY KEY,
  first text NOT NULL,
  last text NOT NULL,
  address text NOT NULL,
  city text NOT NULL,
  gender text NOT NULL,
  birthdate varchar(12) NOT NULL,
  Identification varchar(25) NOT NULL,
  phone varchar(20) NOT NULL,
  email varchar(45) NOT NULL,
  password varchar(45) NOT NULL
)

INSERT INTO users VALUES (7,'hesham','hanafy','agamy bitash','alexandria','male','2017-02-16','2147483647','1024677811','hesham_hanafy44@yahoo.com','123');