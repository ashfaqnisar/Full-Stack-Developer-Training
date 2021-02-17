select distinct u.name, u.address
from users u
inner join bookingdetails b on b.user_id = u.user_id
where u.user_id not in (select b.user_id from bookingdetails b where name = 'HDFC')
order by u.name;
