package ElectricityBillAutomation;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ElectricityBoard electricityBoard = new ElectricityBoard();
        List<ElectricityBill> bills = electricityBoard.generateBill("ElectricityBill.txt");
        electricityBoard.addBill(bills);
    }
}
