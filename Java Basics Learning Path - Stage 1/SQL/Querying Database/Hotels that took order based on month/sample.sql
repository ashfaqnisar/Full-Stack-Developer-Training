select distinct h.hotel_id, h.hotel_name, h.rating
from hotel_details h,
     orders o
where h.hotel_id = o.hotel_id and Month (o.order_date) = 7
order by h.hotel_id asc;
