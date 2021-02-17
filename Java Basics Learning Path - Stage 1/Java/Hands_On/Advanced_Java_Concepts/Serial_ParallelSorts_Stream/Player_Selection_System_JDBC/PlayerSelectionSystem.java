package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Player_Selection_System_JDBC;
/*Remove the package import from the code in genc learn*/

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayerSelectionSystem {

    public List<String> playersBasedOnHeightWeight(double minHeight, double maxWeight) {

        // Fill your code here

        List<String> playerList = new ArrayList<>();

        try {
            Connection connection = DB.getConnection();

            String query = "SELECT * FROM player WHERE height >= " + minHeight + " AND weight <= " + maxWeight
                    + " ORDER BY playerName";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                playerList.add(resultSet.getString("playerName"));
            }

            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return playerList;
    }
}
