package ArrayException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {
    public String getPriceDetails() {
        try {
            Scanner sc = new Scanner(System.in);
            int index, length;
            System.out.println("Enter the number of elements in the array");
            length = sc.nextInt();

            System.out.println("Enter the price details");
            int[] prices = new int[length];
            for (int i = 0; i < length; i++) {
                prices[i] = sc.nextInt();
            }

            System.out.println("Enter the index of the array element you want to access");

            index = sc.nextInt();
            return ("The array element is " + prices[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            return ("Array index is out of range");
        } catch (InputMismatchException e) {
            return ("Input was not in the correct format");
        }

    }

//    Make the get price details to static to check it whether it is working or not
   /* public static void main(String[] args) {
        System.out.println(getPriceDetails());
    }*/
}
