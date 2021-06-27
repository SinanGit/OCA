package Basics;

import java.util.Scanner;

public class basics1 {
    public static void main(String[] args) {


    /*1. Write a Java program to print 'Hello' on screen and then print your name on a separate line. Go to the editor
Expected Output :
Hello
Alexandra Abramov*/

        System.out.println("Hello\nSinan Yorulmaz");

        /*2. Write a Java program to print the sum of two numbers. Go to the editor
Test Data:
74 + 36
Expected Output :
110*/

        int a = 74;
        int b = 36;
        System.out.println("Sum : " + (a + b));

        /*3. Write a Java program to divide two numbers and print on the screen. Go to the editor
Test Data :
50/3
Expected Output :
16*/

        System.out.println("Division : " + 36 / 2);

        /*4. Write a Java program to print the result of the following operations. Go to the editor
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13*/
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

/*5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/

       Scanner scanner = new Scanner(System.in);
       /*  System.out.print("please enter a number: ");
        int input1 = scanner.nextInt();
        System.out.print("please enter a number: ");
        int input2 = scanner.nextInt();
        System.out.println("The result is: "+ (input1*input2));*/

        /*6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/
        System.out.println("Sum: " + (125+24));
        System.out.println("Multiply: " + (125*24));
        System.out.println("Subtract: " + (125-24));
        System.out.println("Divide: " + (125/24));
        System.out.println("Remainder: " + (125%24));


        /*7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/

        System.out.print("enter a number for timetables :");
        int input = scanner.nextInt();
        System.out.println(1 + "x" + input + "=" + (1*input));
        System.out.println(2 + "x" + input + "=" + (2*input));
        System.out.println(3 + "x" + input + "=" + (3*input));
        System.out.println(4 + "x" + input + "=" + (4*input));
        System.out.println(5 + "x" + input + "=" + (5*input));
        System.out.println(6 + "x" + input + "=" + (6*input));
        System.out.println(7 + "x" + input + "=" + (7*input));
        System.out.println(8 + "x" + input + "=" + (8*input));
        System.out.println(9 + "x" + input + "=" + (9*input));
        System.out.println(10 + "x" + input + "=" + (10*input));

    }
}
