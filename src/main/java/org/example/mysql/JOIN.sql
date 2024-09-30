


CREATE DATABASE employee_db;
USE employee_db;




CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    Name VARCHAR(50),
    DepartmentID INT
);
CREATE TABLE Departments (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(50)
);
INSERT INTO Employees (EmployeeID, Name, DepartmentID) VALUES
(1, 'Alice', 101),
(2, 'Bob', 102),
(3, 'Charlie', 103),
(4, 'David', 101),
(5, 'Eve', 104);

INSERT INTO Departments (DepartmentID, DepartmentName) VALUES
(101, 'HR'),
(102, 'IT'),
(103, 'Finance'),
(105, 'Marketing');
select * from Employees;

select * from Departments;

#JOIN:If u want to display contain of two difference table that belong to difference table then we used to join operation.

# INNER JOIN: Give the matching record from both table
SELECT Employees.EmployeeID, Employees.Name, Departments.DepartmentName
FROM Employees
INNER JOIN Departments ON Employees.DepartmentID = Departments.DepartmentID;


#LEFT JOIN: Give all the record from left table only match record right table.

SELECT Employees.EmployeeID, Employees.Name, Departments.DepartmentName
FROM Employees
LEFT JOIN Departments ON Employees.DepartmentID = Departments.DepartmentID;

#RIGHT JOIN: Give all the record from right table only match record left table.
SELECT Employees.EmployeeID, Employees.Name, Departments.DepartmentName
FROM Employees
RIGHT JOIN Departments ON Employees.DepartmentID = Departments.DepartmentID;

#give me the matching record from below two table and output should consist of C,D,E.
#-> X1->A,B,C & X2->E,A,D
select x1.B,x1.C,X2.D,X2.E from x1 inner join x2 on x1.A=x2.A;

#give me the matching record from table T1 and matching record from table T2 and output should consist of B,C,D.
#-> X1->A,B,C & X2->D,A,E
select T1.B,T1.C,T2.D,T2.E from T1 left join T2 on T1.A=T2.A;





