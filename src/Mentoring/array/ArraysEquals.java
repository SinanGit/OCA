package Mentoring.array;

import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args) {
        char[] charArray = {'%', 'f', 'F', '@', '5', 'a', '7', 'T', '#'};
        Arrays.sort(charArray,2,charArray.length-3);
        System.out.println(Arrays.toString(charArray));

    }
}
