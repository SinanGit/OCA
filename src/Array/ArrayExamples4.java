package Array;

import java.util.Arrays;

public class ArrayExamples4 {
    public static void main(String[] args) {
    /*    //        14. Write a Java program to find the common elements between two arrays (string values).
        String[] firstStringArray = {"apple", "orange", "kiwi", "melon"};
        String[] secondStringArray = {"apple", "lemon", "orange", "mango"};

        for (int i = 0; i < firstStringArray.length; i++) {
            for (int j = 0; j < secondStringArray.length; j++) {
                if (firstStringArray[i] == secondStringArray[j]) {
                    System.out.print(firstStringArray[i]+ " ");
                }
            }
        }
        System.out.println(" ");

//        15. Write a Java program to find the common elements between two arrays of integers.
            int[] firstArray = {100, 3, 50, 44, 98, 63};
            int[] secondArray = {12, 3, 63, 57, 81, 50};

            for (int i = 0; i < firstArray.length; i++) {
                for (int j = 0; j < secondArray.length; j++) {
                    if (firstArray[i] == secondArray[j]) {
                        System.out.print(firstArray[i] + " ");
                    }
                }
            }
        System.out.println(" ");
//        16. Write a Java program to remove duplicate elements from an array.
        int[] dublicateRemove = {3, 3, 3, 4, 5, 6, 7, 3};
        for (int i = 0; i < dublicateRemove.length; i++) {
            for (int j = i+1; j < dublicateRemove.length; j++) {
                if (dublicateRemove[i] == dublicateRemove[j]){
                    dublicateRemove[i] = 0;
                }
            }

        }
        System.out.println(Arrays.toString(dublicateRemove));*/
//        17. Write a Java program to find the second largest element in an array.

       int[] secondLargest = {10, 5, 87, 34, 365};
       Arrays.sort(secondLargest);
        for (int i = 0; i < secondLargest.length; i++) {

        } System.out.println(secondLargest[secondLargest.length-2]);

        System.out.println();
//        18. Write a Java program to find the second smallest element in an array.
        System.out.println(secondLargest[1]);
//        19. Write a Java program to add two matrices of same size.

        int size = 4;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        20. Write a Java program to convert an array To ArrayList.

//        21. Write a Java program to convert an ArrayList to an array.
//        22. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
//        23. Write a Java program to test the equality of two arrays.

        int[] array1 = {1,2,3,4};
        int[] array2 = {1,2,3,4};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1 == array2){
                    System.out.println("ok");
                }
            }

        }

    }
}
