package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        //Exercise 1 - Fill and Print an array
        //Write a program that reads in 10 integers
        // from the keyboard storing them in an array.
        // Once they are all read in, print them to the screen.
        // HINT This will need two for loops one after the other -
        // the first reads them in, the second reads them out.

      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 numbers :");
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("index" + i + "=" + numbers[i]);


        }
        System.out.println("Full array is : " + Arrays.toString(numbers));*/


        /*Exercise 2 - Reverse
Read in 10 integers from the keyboard storing them in an array.
 Then print out the same integers in reverse order of input.*/
        int[] reverse = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String[] str = {"Cumming", "Garfield", "Alpharetta"};


        for (int i = str.length - 1; i >= 0; i--) {
            // System.out.print(str[i]);
            char[] c = str[i].toCharArray();
            for (int j = c.length - 1; j >= 0; j--) {
                System.out.print(c[j]+" ");
            }
            System.out.println();
        }



    }
}
