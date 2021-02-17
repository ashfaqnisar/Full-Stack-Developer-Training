package ICT.ElectricityBillAutomation;
/*Remove the package import from the code in genc learn*/

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElectricityBoard {
    public String consumerNumberREGEXP = "0[0-9]{9}";

    public List<ElectricityBill> generateBill(String filePath) {
        List<ElectricityBill> billList = new ArrayList<>();
        try {
            File fileObject = new File(filePath);
            Scanner scanner = new Scanner(fileObject);
            while (scanner.hasNextLine()) {
                String[] lineArray = scanner.nextLine().split(",");
                String consumerNumber = lineArray[0];
                try {
                    if (validate(consumerNumber)) {
                        String consumerName = lineArray[1];
                        String consumerAddress = lineArray[2];
                        int unitsConsumed = Integer.parseInt(lineArray[3]);

                        ElectricityBill electricityBill = new ElectricityBill(
                                consumerNumber,
                                consumerName,
                                consumerAddress,
                                unitsConsumed
                        );
                        electricityBill.calculateBillAmount();
                        billList.add(electricityBill);
                    }
                } catch (InvalidConsumerNumberException e) {
                    System.out.println(e.getMessage());
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return billList;
    }

    public boolean validate(String consumerNumber) throws InvalidConsumerNumberException {
        if (consumerNumber.matches(consumerNumberREGEXP)) {
            return true;
        } else {
            throw new InvalidConsumerNumberException("Invalid Consumer Number");
        }
    }

    public void addBill(List<ElectricityBill> billList) throws SQLException, ClassNotFoundException {
        Connection conn = DBHandler.establishConnection();
        String quote = "'";
        for (ElectricityBill electricityBill : billList) {
            try {
                String pushQuery =
                        "INSERT INTO ElectricityBill Values("
                                + quote + electricityBill.getConsumerNumber() + quote + ","
                                + quote + electricityBill.getConsumerName() + quote + ","
                                + quote + electricityBill.getConsumerAddress() + quote + ","
                                + electricityBill.getUnitsConsumed() + ","
                                + electricityBill.getBillAmount()
                                + ")";
                Statement statement = conn.createStatement();
                statement.executeUpdate(pushQuery);

                statement.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        conn.close();
    }
}
