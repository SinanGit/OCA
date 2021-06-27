package Mentoring.Methods;

public class task1 {
    public static void main(String[] args) {
        printOddNumbers(20);


    }
    public static void printOddNumbers(int number){


        for (int i = 0; i <= number; i++) {
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }
    }
}
