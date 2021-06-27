package Basics.StringMethods;

public class contains {
    public static void main(String[] args) {
        String str = "Hello Techno Study!";
        boolean contains = str.contains("Hello");
        System.out.println(contains);
        // Part1: concatenate string "01234" and "56789" with concat() function
        // Part2: concatenate string "01234" and "56789" using + operator

        String numberString = "01234";
        String numberString2 = "56789";
        String concatenated = numberString.concat(numberString2);
        System.out.println("concatenated = " + concatenated);
    }
}
