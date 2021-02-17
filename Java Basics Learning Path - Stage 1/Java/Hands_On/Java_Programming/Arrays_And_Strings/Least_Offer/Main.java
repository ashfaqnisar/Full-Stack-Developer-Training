package Hands_On.Java_Programming.Arrays_And_Strings.Least_Offer;
/*Remove the package import from the code in genc learn*/

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

public class Main {

    public static void main(String[] args) {
        int n = 0, worstPrice = 0;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        Product[] productItems = new Product[n];

        for (int i = 0; i < n; i++) {
            String input = sc.next();
            String[] inputArray = input.split(",");
            String name = inputArray[0];
            int price = Integer.parseInt(inputArray[1]);
            int discountPercent = Integer.parseInt(inputArray[2]);
            int discountPrice = (price * discountPercent) / 100;

            productItems[i] = new Product(name, price, discountPercent, discountPrice);

            if (i == 0 || discountPrice < worstPrice) worstPrice = discountPrice;
        }

        for (Product productItem : productItems) {
            if (productItem.getDiscountPrice() == worstPrice) {
                System.out.println(productItem.getName());
            }
        }
    }
}
