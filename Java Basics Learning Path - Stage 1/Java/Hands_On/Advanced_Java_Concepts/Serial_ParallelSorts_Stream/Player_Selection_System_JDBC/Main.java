package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Player_Selection_System_JDBC;
/*Remove the package import from the code in genc learn*/

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the minimum height");
        double minHeight = sc.nextDouble();

        System.out.println("Enter the maximum weight");
        double maxWeight = sc.nextDouble();

        PlayerSelectionSystem playerSelectionSystem = new PlayerSelectionSystem();

        List<String> playersList = playerSelectionSystem.playersBasedOnHeightWeight(minHeight, maxWeight);

        if (playersList.isEmpty()) {
            System.out.printf("No players are with minimum height of %.1f and maximum weight of %.1f", minHeight,
                    maxWeight);
            return;
        }

        for (String player : playersList) {
            System.out.println(player);
        }
    }
}
