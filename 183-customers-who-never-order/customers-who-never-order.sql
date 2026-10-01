# Write your MySQL query statement below
Select name AS Customers from Customers
WHERE id NOT IN(Select customerID from Orders);