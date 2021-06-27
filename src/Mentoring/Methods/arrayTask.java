package Mentoring.Methods;

import java.util.Arrays;

public class arrayTask {
    public static void main(String[] args) {
        // Create a method with int [] return ,
        // the array should consist of total of inner arrays in the original.

        // {{2,4,6,8},{1,3,5,7,9},{0,1,2,3,4,5},{9,8,7,5,6,4,3},{4,5,6,7,8,9} };
        // {20, 26, 15 .. }
        int[][] array = {{2,4,6,8},{1,3,5,7,9},{0,1,2,3,4,5},{9,8,7,5,6,4,3},{4,5,6,7,8,9} };
        int[] ints = arraySum(array);
        System.out.println("ints = " + Arrays.toString(ints));

    }
    public static int[] arraySum(int[][] arr){

        int[] sumArray = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            sumArray[i] = sum;
            //sum = 0;
            
        }
        return sumArray;
    }
}
