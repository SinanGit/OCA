package Loops;

import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {
        //Determine and print the number of times the character ‘a’ appears in the input entered by the user.

        Scanner scanner = new Scanner(System.in);

       /* String input = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println(counter);*/

        System.out.println(" ");
        //Write a program that will print a box of #’s taking from user the height and width values.

        // Pyramid Example

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");

        }
    }
}
