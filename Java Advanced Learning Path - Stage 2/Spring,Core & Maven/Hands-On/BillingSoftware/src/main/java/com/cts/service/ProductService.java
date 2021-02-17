package com.cts.service;


import com.cts.bean.Product;
import com.cts.dao.ProductDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductDaoImpl productDaoImpl;

    public Product getProductDetails(int product_code) {
        return productDaoImpl.getProductDetails(product_code);
    }

    public double calculatePrice(int quantity, double product_price) {
        return quantity * product_price;
    }

    public boolean validateProductCode(int product_code) {
        return product_code > 999 && product_code <= 9999;
    }

    public boolean validateQuantity(int quantity) {
        return quantity > 0;
    }
}
