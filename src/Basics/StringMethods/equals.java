package Basics.StringMethods;

public class equals {
    public static void main(String[] args) {

        String str1 = "Sinan";
        String str2 = "sinan";
        boolean equals = str1.equals(str2);
        System.out.println("equals = " + equals);

        boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("equalsIgnoreCase = " + equalsIgnoreCase);

    }
}
