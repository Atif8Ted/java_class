INSERT INTO account_master VALUES ('A00011', 'C00001', 'B00017', 5000, '2014-12-03', 'Savings', 'Active');
INSERT INTO account_master VALUES ('A00012', 'C00002', 'B00018', 4000, '2013-11-23', 'Savings', 'Closed');
INSERT INTO account_master VALUES ('A00013', 'C00001', 'B00017', 2000, '2014-10-28', 'Savings', 'Active');
INSERT INTO account_master VALUES ('A00014', 'C00004', 'B00019', 6000, '2014-05-03', 'Current', 'Active');
INSERT INTO account_master VALUES ('A00015', 'C00003', 'B00020', 2000, '2013-02-05', 'Savings', 'Suspended');
INSERT INTO account_master VALUES ('A00016', 'C00005', 'B00021', 5000, '2013-12-11', 'Current', 'Active');
INSERT INTO account_master VALUES ('A00017', 'C00001', 'B00018', 9000, '2014-07-09', 'Current', 'Suspended');
INSERT INTO account_master VALUES ('A00018', 'C00005', 'B00022', 8000, '2013-08-03', 'Savings', 'Active');
INSERT INTO account_master VALUES ('A00019', 'C00004', 'B00017', 1000, '2014-04-24', 'Savings', 'Closed');
INSERT INTO account_master VALUES ('A00020', 'C00006', 'B00018', '7000', '2013-01-01', 'Current', 'Active');


INSERT INTO branch_master VALUES ('B00017', 'Koramangala', 'Bangalore');
INSERT INTO branch_master VALUES ('B00018', 'MountRoad', 'Chennai');
INSERT INTO branch_master VALUES ('B00019', 'CharniRoad', 'Mumbai');
INSERT INTO branch_master VALUES ('B00020', 'ElectronicCity', 'Banglore');
INSERT INTO branch_master VALUES ('B00021', 'AshokNagar', 'Chennai');
INSERT INTO branch_master VALUES ('B00022', 'AnnaNagar', 'Chennai');
INSERT INTO branch_master VALUES ('B00023', 'HugesRoad', 'Mumbai');
INSERT INTO branch_master VALUES ('B00024', 'Aundh', 'Pune');
INSERT INTO branch_master VALUES ('B00025', 'RajajiNagar', 'Bangalore');


INSERT INTO customer_master VALUES ('C00001', 'Karanveer', 'Singh', 'Sumag', 'Pune', '9874563256', 'Accountant', '1997-02-03');
INSERT INTO customer_master VALUES ('C00002', 'Lokesh', 'Kumar', 'Rao', 'Chennai', '4589657856', 'Engineer', '1992-03-06');
INSERT INTO customer_master VALUES ('C00003', 'Rana', 'Ratan', 'Singh', 'Pune', '8745632569', 'Doctor', '1987-12-23');
INSERT INTO customer_master VALUES ('C00004', 'Lakshmi ', 'Kanth', 'Rai', 'Banglore', '8965745236', 'Accountant', '1983-02-05');
INSERT INTO customer_master VALUES ('C00005', 'Jawahar', 'Lal', 'Nehru', 'Delhi', '9998564752', 'Admin', '1992-07-24');
INSERT INTO customer_master VALUES ('C00006', 'Shyamala', 'Priya', 'Rani', 'Chennai', '7458963256', 'Engineer', '1996-03-05');
INSERT INTO customer_master VALUES ('C00007', 'Atul', 'Kumar', 'Shastri', 'Mumbai', '8547896321', 'Technician', '1985-04-12');
INSERT INTO customer_master VALUES ('C00008', 'Ravi', 'Kumar', 'Reddy', 'Banglore', '9874563256', 'Technician', '1982-04-07');
INSERT INTO customer_master VALUES ('C00009', 'Veena', 'Kumar', 'Iyer', 'Chennai', '8745896321', 'Admin', '1999-01-02');
INSERT INTO customer_master VALUES ('C00010', 'Ram', 'Sekar', 'Prasad', 'Pune', '2587445698', 'Doctor', '1986-10-12');


INSERT INTO loan_details VALUES('C00004','B00019',20000);
INSERT INTO loan_details VALUES('C00001','B00017',30000);
INSERT INTO loan_details VALUES('C00005','B00022',25000);
INSERT INTO loan_details VALUES('C00006','B00018',32000);


INSERT INTO transaction_details values('T00001','A00015','2014-02-05','Cash','Deposit',2000);
INSERT INTO transaction_details values('T00002','A00017','2014-12-09','Cheque','Deposit',6000);
INSERT INTO transaction_details values('T00003','A00015','2014-06-05','Cheque','WithDraw',1000);
INSERT INTO transaction_details values('T00004','A00018','2013-11-03','Cash','Deposit',4000);
INSERT INTO transaction_details values('T00005','A00017','2015-01-09','Cheque','WithDraw',5000);

