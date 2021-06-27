package Basics;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        /*1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. Go to the editor
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius*/

        Scanner scanner = new Scanner(System.in);
        float F = scanner.nextFloat();
        float C = (5*(F-32)/9);
        System.out.println("Converted F to C is: " + C);

    }
}
