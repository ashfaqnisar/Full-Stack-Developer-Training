package Hands_On.Applying_Object_Oriented_Concepts.Exception_Handling.Register_A_Candidate;
/*Remove the package import from the code in genc learn*/

public class InvalidSalaryException extends Exception {

    public InvalidSalaryException(String s) {
        super(s);
    }
}
