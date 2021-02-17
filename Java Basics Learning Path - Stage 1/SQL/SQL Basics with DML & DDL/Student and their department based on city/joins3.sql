select s.student_name, d.department_name
from department d,
     student s
where s.city = 'Coimbatore'
  and s.department_id = d.department_id
order by s.student_name asc;
