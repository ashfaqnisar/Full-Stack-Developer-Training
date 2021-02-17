package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Fruit_Basket_Estimation;
/*Remove the package import from the code in genc learn*/

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option, weightInKgs, pricePerKg;
        String fruitName;

        FruitBasketUtility fruitBasketUtility = new FruitBasketUtility();
        do {
            System.out.println("Select an option:\n1.Add Fruit to Basket\n2.Calculate Bill\n3.Exit");
            option = sc.nextInt();

            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Enter the fruit name");
                    fruitName = sc.nextLine();
                    System.out.println("Enter weight in Kgs");
                    weightInKgs = sc.nextInt();
                    System.out.println("Enter price per Kg");
                    pricePerKg = sc.nextInt();
                    FruitBasket fruitBasket1 = new FruitBasket(fruitName, weightInKgs, pricePerKg);
                    fruitBasketUtility.addToBasket(fruitBasket1);
                    break;
                case 2:
                    List<FruitBasket> list = fruitBasketUtility.getFruitBasketList();
                    if (list.isEmpty()) {
                        System.out.println("Your basket is empty. Please add fruits.");
                    } else {
                        FruitBasket[] fruitBaskets = new FruitBasket[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            FruitBasket fruitBasket = list.get(i);
                            fruitBaskets[i] = fruitBasket;
                        }
                        Stream<FruitBasket> fruitBasketStream = Arrays.stream(fruitBaskets);
                        int amount = fruitBasketUtility.calculateBill(fruitBasketStream);
                        System.out.println("The estimated bill amount is Rs " + amount);
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the application.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

        } while (option != 3);

    }

}
