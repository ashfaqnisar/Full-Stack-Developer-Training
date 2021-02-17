package Hands_On.Java_Programming.Introduction_To_Java.Display_Characters;
/*Remove the package import from the code in genc learn*/

import java.util.LinkedHashMap;
import java.util.Scanner;

public class AsciValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<Integer, Character> mapValues = new LinkedHashMap<>();

        System.out.println("Enter the digits");
        for (int i = 0; i < 4; i++) {
            int inputValue = sc.nextInt();
            mapValues.put(inputValue, (char) inputValue);
        }

        for (Integer key : mapValues.keySet()) {
            System.out.println(key + "-" + mapValues.get(key));
        }

    }
}
