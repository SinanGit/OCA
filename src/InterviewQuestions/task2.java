package InterviewQuestions;

public class task2 {
    // create a method with an int parameter as N.
    // print all numbers from 1 to N (N is included)
    // if number is divisible by 2, replace it by "Codility"
    // if number is divisible by 3, replace it by "Test"
    // if number is divisible by 5, replace it by "Coders"
    // if number is divisible by 2 and 3 => CodilityTest
    // if number is divisible by 2 and 5 => CodilityCoders
    // if number is divisible by 3 and 5 => TestCoders
    // if number is divisible by 2 and 3 and 5 => CodilityTestCoders
    public static void main(String[] args) {
number(24);

    }
    public static void number(int n){

        for (int i = 1; i <=n; i++) {
            if (i%2==0 && i%3==0 && i%5==0) {
                System.out.println("CodilityTestCoders");
            }else if (i%2==0 && i%5==0){
                System.out.println("CodilityCoders");
            }else if (i%3==0 && i%5==0) {
                System.out.println("TestCoders");
            }else if (i%2==0){
                System.out.println("Codility");
            }else if(i%3==0){
                System.out.println("Test");
            } else if(i%5==0){
                System.out.println("Coders");

            }else {
                System.out.println(i);
            }
        }
    }
}
