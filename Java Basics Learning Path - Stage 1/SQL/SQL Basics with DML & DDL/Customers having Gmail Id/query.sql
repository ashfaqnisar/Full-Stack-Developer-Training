select c.customer_id, c.customer_name, c.address, c.phone_no
from customers c;
where c.email_id like '%{$gmail.com}'
order by c.customer_id asc;
