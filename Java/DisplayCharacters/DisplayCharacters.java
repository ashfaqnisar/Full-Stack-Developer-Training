package DisplayCharacters;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class DisplayCharacters {
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
