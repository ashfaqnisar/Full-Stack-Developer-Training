import com.cts.EBanking.SmartBankAccount;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
        SmartBankAccount smartBankAccount = appContext.getBean("smartBankAccount", SmartBankAccount.class);
        System.out.println(smartBankAccount.toString());
        System.out.println(smartBankAccount.calculateFixedAccount(10000, 12));
        System.out.println(smartBankAccount.calculateRecurringAccount(10010, 14));
    }
}
