package Mentoring.Homework;

public class pyramids {
    public static void main(String[] args) {

        //Part 1
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println("<========================>");

        //Part 2
            for (int a = 5; a >0; a--) {
                for (int j = a; j >0; j--) {
                    System.out.print("*");
                }
                System.out.println();

            }
        System.out.println("<========================>");
            //Part 3

           for (int b = 5; b > 0; b--) {
                for (int j = 1; j <= 5 - b; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= b; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        System.out.println("<========================>");

            for (int d = 5; d >= 1; d--) {
                for (int j = 1; j <= d; j++) {
                    System.out.print(" ");
                }
                for (int j = 5; j >= d; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        System.out.println("<========================>");

            for (int e = 0; e < 5; e++) {
                for (int j = 0; j < 5 - e; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= e; k++) {
                    System.out.print("* ");

                }
                System.out.println();
            }
        System.out.println("<========================>");
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