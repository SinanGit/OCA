package Array;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
// Using scanner class create two products with the prices. ex: s1 = "Bread" s2 = "Price for bread", s3 = "Milk", s4 = "Price for Milk"
        // the output should be total = 1.5 + 2.5 = 4.0

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a product name: ");
        String  product = scanner.nextLine();
        System.out.print("Enter a product name: ");
        String  product2 = scanner.nextLine();

        System.out.print("Enter the price: ");
        double price = scanner.nextDouble();


        System.out.print("Enter the price: ");
        double price2 = scanner.nextDouble();

        System.out.println("Total = " + price + "+" + price2 +" = " + (price+price2));



    }
}
