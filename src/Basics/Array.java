package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numericArray = {3,98,45,23};
        String [] stringArray = {"Selda", "Neda", "Ihsan", "Sinan"};
        Arrays.sort(numericArray);
        Arrays.sort(stringArray);

//        System.out.println(Arrays.toString(numericArray));
//        System.out.println(Arrays.toString(stringArray));
//        1.
//        Take 10 integer inputs from user and store them in an array and print them on screen.

        int[] inputArray = new int[10];
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("enter value for index "+i+ " =");
            inputArray[i] = scanner.nextInt();

        }
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("index "+i+ " = "+inputArray[i]);

        }


//        2.
//        Take 10 integer inputs from user and store them in an array. Again ask user to give a number.
//        Now, tell user whether that number is present in array or not.
        int[] newArray = new int[10];
        for (int i = 0; i < newArray.length; i++) {
            System.out.print("Enter a number for index :"+ i);
            newArray[i] = scanner.nextInt();

        }
        System.out.print("enter one more number: ");
        int newNum = scanner.nextInt();

        for (int i = 0; i < newArray.length; i++) {

        }


        }
        }
//        3.
//        Take 20 integer inputs from user and print the following:
//        number of positive numbers
//        number of negative numbers
//        number of odd numbers
//        number of even numbers
//        number of 0s.
//        4.
//        Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.
//        5.
//        Write a program to find the sum and product of all elements of an array.
//        6.
//        Initialize and print all elements of a 2D array.
//        7.
//        Find largest and smallest elements of an array.
//        8.
//        Write a program to check if elements of an array are same or not it read from front or back. E.g.-
//                9.
//        Take an array of 10 elements. Split it into middle and store the elements in two dfferent arrays. E.g.-
//                INITIAL array :
//        58	24	13	15	63	9	8	81	1	78
//
//        After spliting :
//        58	24	13	15	63
//        9	8	81	1	78
//        10.
//        Consider an integer array, the number of elements in which is determined by the user. The elements are also taken as input from the user. Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.
//
//        11.
//        If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60], your program should be able to find that the subarray lies between the indexes 3 and 8.
//    }