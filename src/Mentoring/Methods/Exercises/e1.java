package Mentoring.Methods.Exercises;

public class e1 {
    public static void main(String[] args) {
        int smallestNumber = smallestNumber(25, 37, 29);
        System.out.println("smallestNumber = " + smallestNumber);;

    }
//    1. Write a Java method to find the smallest number among three numbers.
//Test Data:
//Input the first number: 25
//Input the Second number: 37
//Input the third number: 29
//Expected Output:
//
//The smallest value is 25.0
    public static int smallestNumber(int a, int b, int c){

        return Math.min(Math.min(a,b),c);
    }
}
