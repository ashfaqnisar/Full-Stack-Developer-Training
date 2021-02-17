package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Search_For_Trains_JDBC;
/*Remove the package import from the code in genc learn*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the source");
        String source = sc.next();

        System.out.println("Enter the destination");
        String destination = sc.next();

        System.out.println("Enter the coach type");
        String coachType = sc.next();

        if (coachType.equalsIgnoreCase("AC1") || coachType.equalsIgnoreCase("AC2") || coachType.equalsIgnoreCase("AC3")
                || coachType.equalsIgnoreCase("Sleeper") || coachType.equalsIgnoreCase("Seater")) {

            TrainManagementSystem tms = new TrainManagementSystem();
            ArrayList<Train> trainList = tms.viewTrain(coachType, source, destination);

            if (trainList.isEmpty()) {
                System.out.println("No trains found");
                return;
            }

            for (Train train : trainList) {
                System.out.println(train.getTrainNumber() + " " + train.getTrainName());
            }
            return;
        }
        System.out.println("Invalid Coach Type");
    }
}
