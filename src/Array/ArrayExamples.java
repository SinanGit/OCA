package Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayExamples {
    public static void main(String[] args) {

        int[] randomArray = new int[100];
        Random random = new Random();
        int sum =0;
        for (int i = 0; i < randomArray.length; i++) {
            int randomNumber = random.nextInt(100);
            randomArray[i] = randomNumber;
            sum +=randomArray[i];

        }
        double average = (double) sum/ randomArray.length;

        int counter = 0;
        for (int i = 0; i < randomArray.length; i++) {
        if (randomArray[i] < average){
           counter++;
        }
        }
        System.out.println(Arrays.toString(randomArray));
        System.out.println("Sum : "+ sum);
        System.out.println("average : " + average);
        System.out.println("Under the average: " + counter);



    }
}
