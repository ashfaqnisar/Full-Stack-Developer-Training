import java.util.Scanner;

class Product {
    String name;
    int price, discountPercentage, discountPrice;

    public Product(String name, int price, int discountPercentage, int discountPrice) {
        this.name = name;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.discountPrice = discountPrice;
    }

    public String getName() {
        return name;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }
}

public class LeastOffer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0, worstPrice = 0;

        n = sc.nextInt();
        Product[] productItems = new Product[n]; //Product Array with the length of the input.

        for (int i = 0; i < n; i++) {
            String input = sc.next(); //Take the input
            String[] inputArray = input.split(","); //Split the input based on comma.
            String name = inputArray[0]; //The array item contains the name.
            int price = Integer.parseInt(inputArray[1]); //The Second array item contains the price.
            int discountPercent = Integer.parseInt(inputArray[2]); //The Third array contains the discount percentage.
            int discountPrice = (price * discountPercent) / 100; //Based on the price & discount percentage, get the discount price.

            // Create a product object using the values and assign it to the product items array.
            productItems[i] = new Product(name, price, discountPercent, discountPrice);

            // The below statement, will get us the lowest discount price.
            if (i == 0 || discountPrice < worstPrice) worstPrice = discountPrice;
        }

        // Print all the product items, which have the worst price in the provided input.
        for (Product productItem : productItems) {
            if (productItem.getDiscountPrice() == worstPrice) {
                System.out.println(productItem.getName());
            }
        }
    }
}
