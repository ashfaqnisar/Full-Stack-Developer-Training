import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProductTest {
    @Test
    public void deleteproduct() {
        Product product1 = new Product("1", "Flour", 45.2);
        Product product2 = new Product("2", "Coke", 50.1);
        Product product3 = new Product("3", "Sugar", 120.0);
        Product product4 = new Product();

        ProductDAO productDAO = new ProductDAO();

        /*Add Product Object*/
        assertTrue(productDAO.addProduct(product1));
        assertTrue(productDAO.addProduct(product2));
        assertTrue(productDAO.addProduct(product4));
        assertFalse(productDAO.addProduct(null));

        product1.setPrice(1000);

        /*Delete Product Object*/
        assertTrue(productDAO.deleteProduct(product1));
        assertTrue(productDAO.deleteProduct(product2));
        assertTrue(productDAO.deleteProduct(product4));
        assertFalse(productDAO.deleteProduct(null));
        assertFalse(productDAO.deleteProduct(product3));

        System.out.println("Inside the product Test");
    }
}

