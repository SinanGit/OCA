package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class deneme {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[][]accounts = {{2,8,7},{7,1,3},{1,9,5}};
        accounts(accounts);

    }
    public static void accounts(int[][] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                max += arr[i][j];
                if (max<arr[i][j]){
                    max = Math.max(max,arr[i][j]);
                }
            }
        }
        System.out.println(max);
    }
}