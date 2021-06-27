package GoodSolutions;

public class duplicate {
    public static void main(String[] args) {
        // Write a Java program to prints the duplicate values of an array of integer values
        int array[] = {1, 2, 5, 5, 6, 6, 7, 2, 7};

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] == array[j]){
                    System.out.println("This is a duplicate: " + array[j]);
                }
            }
        }
    }
}
