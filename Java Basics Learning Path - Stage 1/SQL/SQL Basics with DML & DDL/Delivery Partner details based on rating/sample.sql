select dp.partner_id, dp.partner_name, dp.phone_no
from delivery_partners dp
where dp.rating between 3 and 5
order by dp.partner_id asc;
