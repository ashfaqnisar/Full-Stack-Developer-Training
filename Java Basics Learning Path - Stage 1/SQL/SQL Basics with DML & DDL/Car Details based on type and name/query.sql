select c.car_id, c.car_name, c.car_type
from cars c
where c.car_name like '%Maruthi%'
  and c.car_type = "Sedan"
order by c.car_id asc;
