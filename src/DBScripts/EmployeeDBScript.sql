-- Drop tables if they exist
DROP TABLE IF EXISTS dbo.Employee;
DROP TABLE IF EXISTS dbo.JobTitle;

-- Create Tables
CREATE TABLE dbo.JobTitle
(
titleId INT IDENTITY PRIMARY KEY,
titleType VARCHAR(255) NOT NULL,
titleDescription VARCHAR(255)
);

CREATE TABLE dbo.Employee
(
employeeId INT IDENTITY PRIMARY KEY,
titleId INT FOREIGN KEY REFERENCES dbo.JobTitle(titleId),
employeeName VARCHAR(255) NOT NULL,
email VARCHAR(255),
telephone VARCHAR(255),
startYear INT,
department VARCHAR(255),
university VARCHAR(255),
);

-- Add data
SET IDENTITY_INSERT dbo.JobTitle ON;
insert into dbo.JobTitle (titleId,titleType,titleDescription) values ( 1,'Environmental Tech', 'Software Environmental Tech');
insert into dbo.JobTitle (titleId,titleType,titleDescription) values ( 2,'Health Coach II', 'Software Health Coach II');
insert into dbo.JobTitle (titleId,titleType,titleDescription) values ( 3,'Paralegal', 'Software Paralegal');
insert into dbo.JobTitle (titleId,titleType,titleDescription) values ( 4,'Database Administrator III', 'Software Database Administrator III');
insert into dbo.JobTitle (titleId,titleType,titleDescription) values ( 5,'Mechanical Systems Engineer', 'Software Mechanical Systems Engineer');
insert into dbo.JobTitle (titleId,titleType,titleDescription) values ( 6,'Developer II', 'Software Developer II');
SET IDENTITY_INSERT dbo.JobTitle OFF;

SET IDENTITY_INSERT dbo.Employee ON;
insert into dbo.Employee (employeeId,titleId,employeeName,email,telephone,startYear,department,university) values ( 1,1,'Carlina Featherstonhalgh','cfeatherstonhalgh0@google.com.br','4576154875',2009,'Human Resources','Universidad Jse Vasconcelos');
insert into dbo.Employee (employeeId,titleId,employeeName,email,telephone,startYear,department,university) values ( 2,4,'Whitney Chainey','wchainey1@hao123.com','3539965225',2019,'Training','Hanshin University');
insert into dbo.Employee (employeeId,titleId,employeeName,email,telephone,startYear,department,university) values ( 3,2,'Gwynne Gavey','ggavey2@blogspot.com','2836858847',2018,'Marketing','Sinai University');
insert into dbo.Employee (employeeId,titleId,employeeName,email,telephone,startYear,department,university) values ( 4,6,'Tonya Harms','tharms3@artisteer.com','3516860928',1994,'Engineering','Kansai Medical University');
insert into dbo.Employee (employeeId,titleId,employeeName,email,telephone,startYear,department,university) values ( 5,6,'Jeannie Chateau','jchateau4@google.com.au','7865680415',1972,'Product Management','Nanjing University of Traditional Chinese Medicine');
insert into dbo.Employee (employeeId,titleId,employeeName,email,telephone,startYear,department,university) values ( 6,3,'Giraud Maseres','gmaseres5@flickr.com','1343086686',2008,'Support','London Institute of Management and Technology');
insert into dbo.Employee (employeeId,titleId,employeeName,email,telephone,startYear,department,university) values ( 7,5,'Gertrud Sprionghall','gsprionghall6@oracle.com','2284665984',1957,'Research and Development','Northwestern University In Qatar');
insert into dbo.Employee (employeeId,titleId,employeeName,email,telephone,startYear,department,university) values ( 8,5,'Teddi Mellings','tmellings7@prweb.com','3947132637',1993,'Support','Asian University of Science and Technology');
insert into dbo.Employee (employeeId,titleId,employeeName,email,telephone,startYear,department,university) values ( 9,1,'Fredi MacGillicuddy','fmacgillicuddy8@diigo.com','2102906310',2003,'Training','Dares Salaam Institute of Technology');
insert into dbo.Employee (employeeId,titleId,employeeName,email,telephone,startYear,department,university) values ( 10,6,'Eduardo Harlowe','eharlowe9@ucoz.ru','6112049956',1994,'Sales','Universidad Nacional Mayor de San Marcos');
SET IDENTITY_INSERT dbo.Employee OFF;