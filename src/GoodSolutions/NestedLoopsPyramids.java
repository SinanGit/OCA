package GoodSolutions;

public class NestedLoopsPyramids {
    public static void main(String[] args) {

       // Half Pyramid 1
        for (int i = 0; i<= 6; i++) {
            for (int j=0; j<=i ; j++) {
                System.out.print("*");

            }System.out.println();
        }

        // Inverted Half Pyramid 2

        for (int i = 1; i<=5; i++) {
            for (int j = 5; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Full Pyramid patern

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        // Inverted full pyramid

        for (int i = 5; i>=0 ; i--) {
            for (int j = 0; j <5-i ; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
