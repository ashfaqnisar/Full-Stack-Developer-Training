package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Search_For_Trains_JDBC;
/*Remove the package import from the code in genc learn*/

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TrainManagementSystem {

    public ArrayList<Train> viewTrain(String coachType, String source, String destination) {

        // Fill your code here
        ArrayList<Train> trainList = new ArrayList<Train>();

        try {
            Connection connection = DB.getConnection();

            String query = "SELECT * FROM train WHERE source = '" + source + "' AND destination = '" + destination
                    + "' AND " + coachType + " != 0 ORDER BY train_number";

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {

                int trainNumber = resultSet.getInt(1);
                String trainName = resultSet.getString(2);
                String sourceCity = resultSet.getString(3);
                String destinationCity = resultSet.getString(4);
                int ac1 = resultSet.getInt(5);
                int ac2 = resultSet.getInt(6);
                int ac3 = resultSet.getInt(7);
                int sl = resultSet.getInt(8);
                int ss = resultSet.getInt(9);

                trainList.add(new Train(trainNumber, trainName, sourceCity, destinationCity, ac1, ac2, ac3, sl, ss));
            }
            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return trainList;
    }
}
