package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Add_Flight_Using_JDBC;
/*Remove the package import from the code in genc learn*/

import java.sql.Connection;
import java.sql.PreparedStatement;

public class FlightManagementSystem {

    public boolean addFlight(Flight flightObj) {
        try {
            DB db = new DB();
            Connection connection = DB.getConnection();

            PreparedStatement pst = connection.prepareStatement("insert into flight values(?,?,?,?,?)");

            pst.setInt(1, flightObj.getFlightId());
            pst.setString(2, flightObj.getSource());
            pst.setString(3, flightObj.getDestination());
            pst.setInt(4, flightObj.getNoOfSeats());
            pst.setDouble(5, flightObj.getFlightFare());

            int response = pst.executeUpdate();

            connection.close();

            if (response > 0)
                return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;

    }
}
