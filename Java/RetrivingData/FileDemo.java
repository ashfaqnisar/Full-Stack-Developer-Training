package RetrivingData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        String line;
        try {
            /* FileReader reads text files in the default encoding */
            FileReader fileReader = new FileReader("log.txt");

            /* always wrap the FileReader in BufferedReader */
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            /* always close the file after use */
            bufferedReader.close();
        } catch (IOException ex) {
            System.out.println("Error reading file named '" + "log.txt" + "'");
        }

    }
}
