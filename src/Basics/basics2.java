package Basics;

import java.util.Scanner;

public class basics2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*152. Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise. Go to the editor

Sample Output:
Input first number: 25
Input second number: 37
Input third number: 45
Input fourth number: 23
Numbers are not equal!*/
        System.out.println("4 digits: ");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();
        int int4 = scanner.nextInt();

        if (int1 == int2 && int2 == int3 && int3 == int4){
            System.out.println("Numbers are equal");
        }else {
            System.out.println("Numbers are not equal");
        }
    }

}
