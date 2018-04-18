
DROP DATABASE lonems;

CREATE DATABASE lonems;

USE lonems;

CREATE TABLE employee_master
(
employee_id VARCHAR(6),
employee_name VARCHAR(20),
designation VARCHAR(25), 
department VARCHAR(25),
gender CHAR(1),
date_of_birth DATE,
date_of_joining DATE,
CONSTRAINT employee_master_employee_id_pk PRIMARY KEY(employee_id)
);


CREATE TABLE item_master
(
item_id VARCHAR(6),
item_description VARCHAR(25),
issue_status CHAR(1),
item_make VARCHAR(25),
item_category VARCHAR(20),
item_valuation INT(6),
CONSTRAINT item_master_item_id_pk PRIMARY KEY (item_id)
);


CREATE TABLE loan_card_master
(
loan_id VARCHAR(6), 
loan_type VARCHAR(15), 
duration_in_years INT(2),
CONSTRAINT loan_card_master_loan_id_pk PRIMARY KEY (loan_id)
);



CREATE TABLE employee_issue_details
(
issue_id VARCHAR(6),
employee_id VARCHAR(6),
item_id VARCHAR(6), 
issue_date DATE,
return_date DATE,
CONSTRAINT employee_issue_details_issue_id_pk PRIMARY KEY (issue_id),
CONSTRAINT employee_issue_details_customer_id_fk FOREIGN KEY(employee_id) REFERENCES employee_master(employee_id),
CONSTRAINT employee_issue_details_item_id_fk FOREIGN KEY(item_id) REFERENCES item_master(item_id)
);


CREATE TABLE employee_card_details
(
employee_id VARCHAR(6), 
loan_id VARCHAR(6), 
card_issue_date DATE,
CONSTRAINT employee_card_details_employee_id_fk FOREIGN KEY(employee_id) REFERENCES employee_master(employee_id),
CONSTRAINT employee_card_details_loan_id_fk FOREIGN KEY(loan_id) REFERENCES loan_card_master(loan_id)
);














