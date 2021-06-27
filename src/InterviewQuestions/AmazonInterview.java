package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class AmazonInterview {
    public static void main(String[] args) {
        int[] intArr = {1,5,6,9};
        int[] newArr = new int[intArr.length];

        int tempResult=1;
            for (int i = 0; i < intArr.length; i++) {
             tempResult *=intArr[i];
            }
        for (int i = 0; i < intArr.length; i++) {
            newArr[i] = tempResult/intArr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
