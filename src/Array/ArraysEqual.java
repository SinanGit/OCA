package Array;

import java.util.Arrays;

public class ArraysEqual {
    public static void main(String[] args) {
        // create a String array of {"10", "20"}
// create a byte array of {20, 10}
// convert String array into byte array
// compare them together

        String[] strArray = {"10", "20"};
        byte[] byteArray = {20, 10};

        byte[] convertedByte = new byte[2];
        convertedByte[0] = Byte.parseByte(strArray[0]);
        convertedByte[1] = Byte.parseByte(strArray[1]);


        System.out.println(Arrays.equals(byteArray, convertedByte));

    }
}
