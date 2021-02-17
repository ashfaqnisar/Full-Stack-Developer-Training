select r.rental_id, ca.car_id, c.customer_id, r.km_driven
from rentals r,
     customers c,
     cars ca
where r.car_id = ca.car_id
  and r.customer_id = c.customer_id
  and date (r.return_date) between '2019-08-01'
  and '2019-08-31'
order by r.rental_id asc;
