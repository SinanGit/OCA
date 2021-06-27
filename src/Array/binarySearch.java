package Array;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {

        String[] strArray = {"Hello", "World", "And", "Kayseri"};
        Arrays.sort(strArray);
        System.out.println("strArray = " + Arrays.toString(strArray));
        int search = Arrays.binarySearch(strArray, "And");
        System.out.println("search = " + search);

        //verify if two arrays are equals
        String[] array1 = {"1", "2"};
        int[] array2 = {1,2};

        int[] converted = new int[2];
        converted[0] = Integer.parseInt(array1[0]);
        converted[1] = Integer.parseInt(array1[1]);

        System.out.println("converted = " + Arrays.toString(converted));

        boolean isEqual = Arrays.equals(converted,array2);
        System.out.println("isEqual = " + isEqual);

    }
}
