package Mentoring.Methods;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        //Given an integer array of numbers. Create a method, which will return an integer array.
        //Each index in the new array will have the sum of all integers of the first array,
        // except the similar index of the first array.

        //Example: {10,20,30,40}
        //Output: {90,80,70,60}
        ;

        int[] arr = {10,20,30,40};
        arraySum(arr);
    }
    public static void arraySum(int[] array){
        int sum = 0;
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                sum +=i;
            }

            newArr[1] = sum-array[i];
        }
        System.out.println(Arrays.toString(newArr));

    }
}
