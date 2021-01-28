package NumberOfNewWords;
//import the necessary packages if needed

import java.util.Scanner;
import java.util.stream.Stream;

@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords {
    private static String SPECIAL_CHAR_REGX = "[\\s,;:.?!]+";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words;
        String[] uniqueWords;

        System.out.println("Enter Student's Article");
        String rawInput = sc.nextLine();

        words = rawInput.toLowerCase().split(SPECIAL_CHAR_REGX);
        System.out.println("Number of words " + words.length);

        uniqueWords = Stream.of(words).distinct().sorted().toArray(String[]::new);
        System.out.println("Number of unique words " + uniqueWords.length);


        System.out.println("The words are");
        for (int i = 0; i < uniqueWords.length; i++) {
            System.out.println(i + 1 + ". " + uniqueWords[i].toLowerCase());
        }
    }
}
