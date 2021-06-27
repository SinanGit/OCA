package GoodSolutions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

    String[] elementArray = {"bird", "dog", "cat", "door"};

        for (int i = elementArray.length-1; i >=0; i--) {
        System.out.print(elementArray[i] + " ");
    }
        // Also

        String[] reversedArray = new String[elementArray.length];
        for (int i = 0, j = elementArray.length-1; i < elementArray.length; i++, j--) {
            reversedArray[j] = elementArray[i];
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
