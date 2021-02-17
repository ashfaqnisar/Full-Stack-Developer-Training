select u.name, concat(substring(u.name, 1, 3), substring(u.phno, 1, 3)) Password
from users u
order by u.name asc;
