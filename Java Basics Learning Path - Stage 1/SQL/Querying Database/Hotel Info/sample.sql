select concat(h.hotel_name, " is a ", h.hotel_type, " hotel") HOTEL_INFO
from hotel_details h
order by concat(h.hotel_name, " is a ", h.hotel_type, " hotel") desc;
