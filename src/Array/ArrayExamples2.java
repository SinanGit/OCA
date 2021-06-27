package Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayExamples2 {
    public static void main(String[] args) {
        int[][] twoDimensionArray = new int[3][2];
        int smaller =200;      int larger =0;
        for (int i = 0; i < twoDimensionArray[i].length; i++) {
            for (int j = 0; j < twoDimensionArray[j].length; j++) {
                int randomNumber = (int)(Math.random()*100);
                twoDimensionArray[i][j]=randomNumber;
                System.out.println(i + " satirdaki " + j + " sutun elemani " + twoDimensionArray[i][j]);
                if (smaller > randomNumber){
                    smaller = randomNumber;
                }
                if (larger<randomNumber){
                    larger=randomNumber;
                }
            }
        }

        System.out.println("smaller: " + smaller);
        System.out.println("larger : " + larger);
    }
}
