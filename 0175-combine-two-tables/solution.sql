# Write your MySQL query statement below
select p.firstName,p.lastName,a.state,a.city
from person as p
left join 
address as a
on p.personId=a.personId
