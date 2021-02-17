package ICT.ElectricityBillAutomation;
/*Remove the package import from the code in genc learn*/

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ElectricityBoard electricityBoard = new ElectricityBoard();
        List<ElectricityBill> bills = electricityBoard.generateBill("ICT/ElectricityBillAutomation/ElectricityBill.txt");
        electricityBoard.addBill(bills);
    }
}
