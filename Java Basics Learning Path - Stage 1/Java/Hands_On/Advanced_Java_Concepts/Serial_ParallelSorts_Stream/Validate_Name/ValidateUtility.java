package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Validate_Name;
/*Remove the package import from the code in genc learn*/

import java.util.Scanner;

public class ValidateUtility {

    public static String EMPLOYEE_REGEX = "[a-zA-Z\\s]{5,20}";
    public static String PRODUCT_REGEX = "[a-zA-Z][0-9]{5}";

    public static Validate validateEmployeeName() {
        return name -> name.matches(EMPLOYEE_REGEX);
    }

    public static Validate validateProductName() {
        return productName -> productName.matches(PRODUCT_REGEX);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String productName = sc.nextLine();

        Validate validateEmployeeName = validateEmployeeName();
        Validate validateProductName = validateProductName();

        if (validateEmployeeName.validateName(name)) {
            System.out.println("Employee name is valid");
        } else {
            System.out.println("Employee name is invalid");
        }

        if (validateProductName.validateName(productName)) {
            System.out.println("Product name is valid");
        } else {
            System.out.println("Product name is invalid");
        }
    }

}
