package Mentoring.Methods.Exercises;

public class e8 {
    public static void main(String[] args) {
//        11. Write a Java method to check whether a string is a valid password.
//Password rules:
//A password must have at least ten characters.
//A password consists of only letters and digits.
//A password must contain at least two digits.
//
//Expected Output:
//
//1. A password must have at least eight characters.
//2. A password consists of only letters and digits.
//3. A password must contain at least two digits
//Input a password (You are agreeing to the above Terms and Conditions.): abcd1234
//Password is valid: abcd1234
    }
    public static void validPassword(String password){
    boolean a = password.length()<=10;
    boolean b = password.contains("^\\d.");

}
}