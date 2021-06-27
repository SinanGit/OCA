package Mentoring.Methods.Exercises;

public class e6 {
    public static void main(String[] args) {
        int i = sumOfInt(25);
        System.out.println("i = " + i);
//        6. Write a Java method to compute the sum of the digits in an integer.
//Test Data:
//Input an integer: 25
//Expected Output:
//
//The sum is 7

    }
    public static int sumOfInt(int n){
        int result = 0;

        while(n > 0) {
            result += n % 10;
            n /= 10;
        }

        return result;
    }
}
