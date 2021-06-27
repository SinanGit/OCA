package Array;

import Basics.Array;

import java.util.Arrays;

public class arraysFillIn {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        Arrays.fill(myArray, 3);
        System.out.println("myArray = " + Arrays.toString(myArray));
    }
}
