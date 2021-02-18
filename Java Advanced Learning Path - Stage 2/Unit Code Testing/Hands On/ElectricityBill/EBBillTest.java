import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EBBillTest {
    private EBBill eBill;

    @Test
    public void test1() {
        eBill = new EBBill(0);
        System.out.println("0 = " + eBill.calculateBillAmount());
        assertEquals(0, eBill.calculateBillAmount(),0.0);
    }

    @Test
    public void test2() {
        eBill = new EBBill(50);
        System.out.println("130 = " + eBill.calculateBillAmount());
        assertEquals(130, eBill.calculateBillAmount(), 0.0);
    }

    @Test
    public void test3() {
        eBill = new EBBill(100);
        System.out.println("292.5 = " + eBill.calculateBillAmount());
        assertEquals(292.5, eBill.calculateBillAmount(), 0.0);
    }

    @Test
    public void test4() {
        eBill = new EBBill(200);
        System.out.println("818.5 = " + eBill.calculateBillAmount());
        assertEquals(818.5, eBill.calculateBillAmount(), 0.0);
    }

    @Test
    public void test5() {
        eBill = new EBBill(1000);
        System.out.println("7018.5 = " + eBill.calculateBillAmount());
        assertEquals(7018.5, eBill.calculateBillAmount(), 0.0);
    }

    @Test
    public void test6() {
        eBill = new EBBill(5000);
        System.out.println("47018.5 = " + eBill.calculateBillAmount());
        assertEquals(47018.5, eBill.calculateBillAmount(), 0.0);
    }


}
