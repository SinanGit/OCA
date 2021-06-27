package Mentoring.Methods.Exercises;

public class e7 {
    public static void main(String[] args) {
        System.out.println( leapYear(2021));

//   10. Write a Java method to check whether a year (integer) entered by the user is a leap year or not. Go to the editor
//
//Expected Output:
//
//Input a year: 2017
//false

    }
    public static boolean leapYear(int year){
        boolean a = year%4==0;
        boolean b = year%100!=0;
        boolean c = (year%400==0) && (year%100==0);

        return a && (b||c);
    }
}
