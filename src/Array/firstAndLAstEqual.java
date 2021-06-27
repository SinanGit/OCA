package Array;

public class firstAndLAstEqual {
    public static void main(String[] args) {

        int[] myArray = {1,2,3,1};
        boolean isEqual = false;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[0] == myArray.length - 1) {
                System.out.println(myArray[0]);
                System.out.println(myArray[myArray.length-1]);
                isEqual = true;
            }
        }//System.out.println(isEqual);

    }
}
