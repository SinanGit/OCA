package InterviewQuestions;

import java.util.Arrays;

public class DoesntExistMinNum {
    public static void main(String[] args) {
         int[] myArray = {2,1,3,6,4,5,8,9,7,};
        Arrays.sort(myArray);

        int min = 1;
        for (int j : myArray) {
      if (min == j){
          min++;
      }else if (j<0){
          min = 1;
      }

        }
        System.out.println(min);
    }

}
