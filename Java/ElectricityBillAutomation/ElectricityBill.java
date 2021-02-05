package ElectricityBillAutomation;

public class ElectricityBill {
    private String consumerNumber, consumerName, consumerAddress;
    private int unitsConsumed;
    private double billAmount;

    public String getConsumerNumber() {
        return consumerNumber;
    }

    public void setConsumerNumber(String consumerNumber) {
        this.consumerNumber = consumerNumber;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getConsumerAddress() {
        return consumerAddress;
    }

    public void setConsumerAddress(String consumerAddress) {
        this.consumerAddress = consumerAddress;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public ElectricityBill(String consumerNumber, String consumerName, String consumerAddress, int unitsConsumed) {
        this.consumerNumber = consumerNumber;
        this.consumerName = consumerName;
        this.consumerAddress = consumerAddress;
        this.unitsConsumed = unitsConsumed;
    }

    public void calculateBillAmount() {
        double amount = 0.0;

        if (unitsConsumed <= 100) {
            amount = 0.0;
        } else if (unitsConsumed > 100 && unitsConsumed <= 300) {
            amount += 1.5 * (unitsConsumed - 100);
        } else if (unitsConsumed > 300 && unitsConsumed <= 600) {
            amount += 200 * 1.5;
            amount += (unitsConsumed - 300) * 3.5;
        } else if (unitsConsumed > 600 && unitsConsumed <= 1000) {
            amount += 200 * 1.5;
            amount += 300 * 3.5;
            amount += (unitsConsumed - 600) * 5.5;

        } else {
            amount += 200 * 1.5;
            amount += 300 * 3.5;
            amount += 400 * 5.5;
            amount += (unitsConsumed - 1000) * 7.5;
        }
        this.billAmount = amount;
    }

}
