package Array;

import java.util.Arrays;

public class ArrayExamples3 {
    public static void main(String[] args) {
//1. Write a Java program to sort an numeric array and a string array.
        int[] intArray = {5, 19, 30, 97};
        String[] strArray = {"s", "i", "n", "a", "n"};

        Arrays.sort(intArray);
        //Arrays.sort(strArray);

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(strArray));

        //2. Write a Java program to sum values of an array.

        // Solution 1
        System.out.println("Sum 1 : " + (intArray[0] + intArray[1] + intArray[2] + intArray[3]));

        // Solution 2
        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
        }
        System.out.println("Sum 2 :" + sum);


        //3. Write a Java program to print the following grid.

        int[][] grid = new int[4][4];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {

                System.out.printf("%2d", grid[i][j]);
            }
            System.out.println();

        }

        //4. Write a Java program to calculate average value of an array elements.
        double average = (double) sum / intArray.length;
        System.out.println("Average is: " + average);
        //5. Write a Java program to test if an array contains a certain value.

        for (int i = 0; i < intArray.length; i++) {
        }
        System.out.println("contains 30? : " + (intArray[1] == 30));

        //6. Write a Java program to find the index of an array element.


        int indexOf97 = 0;
        for (int i = 0; i < intArray.length; i++) {
            indexOf97 = Arrays.binarySearch(intArray, 97);
        }

        System.out.println("Index of 97 is: " + indexOf97);

        //7. Write a Java program to remove a specific element from an array.
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] == "a") {
                System.out.println(Arrays.toString(strArray).replace("a", ""));
            }
        }

//        8. Write a Java program to copy an array by iterating the array.
        String[] newArray = new String[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            newArray[i] = strArray[i];
        }
        System.out.println("New Array : " + Arrays.toString(newArray));
//        9. Write a Java program to insert an element (specific position) into an array.
        int[] newIntArray = {5, 4, 3, 2, 3, 5};
        newIntArray[2] = 9;
        System.out.println(Arrays.toString(newIntArray));


//        10. Write a Java program to find the maximum and minimum value of an array.

        int min = 900;
        int max = 0;

        for (int i = 0; i < newIntArray.length; i++) {
            if (newIntArray[i] < min) {
                min = newIntArray[i];
            }
            if (newIntArray[i] > max) {
                max = newIntArray[i];
            }

        }
        System.out.println("Min value is: " + min);
        System.out.println("Max value is: " + max);

//        11. Write a Java program to reverse an array of integer values.
        int temp = 0;
        for (int i = 0; i < newIntArray.length; i++) {
            temp = newIntArray[0];
            //TODO try this code later


        }
//        12. Write a Java program to find the duplicate values of an array of integer values.
        int[] duplicateNumber = {10, 40, 20, 30, 40, 50, 50};
        for (int i = 0; i < duplicateNumber.length; i++) {
            for (int j = i + 1; j < duplicateNumber.length; j++) {
                if (duplicateNumber[i] == duplicateNumber[j]) {
                    System.out.println(duplicateNumber[i]);
                }
            }

        }


//        13. Write a Java program to find the duplicate values of an array of string values.

        String[] fruits = {"apple", "orange", "kiwi", "apple"};

        for (int i = 0; i < fruits.length; i++) {
            for (int j = i + 1; j < fruits.length; j++) {
                if (fruits[i] == fruits[j]) {
                    System.out.println(fruits[i]);
                }
            }
        }
    }
}