create database bms;
use bms;

create table branch_master(
branch_id varchar(6) primary key,
branch_name varchar(30),
branch_city varchar(30));

create table customer_master(
customer_number varchar(6) primary key,
firstname varchar(30),
middlename varchar(30),
lastname varchar(30),
customer_city varchar(15),
customer_contact_no varchar(10),
occupation varchar(20),
customer_date_of_birth date);

create table loan_details(
customer_number varchar(6),
branch_id varchar(6),
loan_amount int(7));

create table account_master(
account_number varchar(6) primary key,
customer_number varchar(6),
branch_id varchar(6),
opening_balance int(7),
account_opening_date date,
account_type varchar(10),
account_status varchar(10));


create table transaction_details(
transaction_number varchar(6),
account_number varchar(6),
date_of_transaction date,
medium_of_transaction varchar(20),
transaction_type varchar(20),
transaction_amount int(7));

