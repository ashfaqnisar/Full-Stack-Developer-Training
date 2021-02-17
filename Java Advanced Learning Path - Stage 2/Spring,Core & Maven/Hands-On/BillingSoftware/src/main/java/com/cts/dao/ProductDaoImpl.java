package com.cts.dao;

import com.cts.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Product getProductDetails(int product_code) {
        String query = "select * from product where product_code=" + product_code;
        return jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(Product.class));
    }
}
