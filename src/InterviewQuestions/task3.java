package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class task3 {
    // Homework
    // Interview question from Leetcode

    // You are given a String array.
    // Calculate total of each values.
    // if value equals to 0, then do not show it.
    // return String


    // input {"X:-1", "Y:1", "X:-4", "B:3", "X:5", "Y:2", "Y:-1", "X:5", "B:-4" };
    // output Y:2,B:-1
    public static void main(String[] args) {

        String[] strArr = {"X:-1", "Y:1", "X:-4", "B:3", "X:5", "Y:2", "Y:-1", "X:5", "B:-4"};
        int[] intArr = new int[3];

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String key: strArr){

        }
        System.out.println(map);
/*
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("X")) {
                intArr[0] += Integer.parseInt(strArr[i].replaceAll("[a-zA-Z:]", ""));

            }else if (strArr[i].contains("Y")) {
                intArr[1] += Integer.parseInt(strArr[i].replaceAll("[a-zA-Z:]", ""));

            }else if (strArr[i].contains("B")) {
                intArr[2] += Integer.parseInt(strArr[i].replaceAll("[a-zA-Z:]", ""));
            }
        }
        System.out.println(Arrays.toString(intArr));
    }*/

    }
}
