package Basics.StringMethods;

public class someMethods {
    public static void main(String[] args) {

        String name = "Sinan Yorulmaz";
        int nameLength = name.length();
        System.out.println("nameLength = " + nameLength);

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        int indexOfY = name.indexOf("Y");
        System.out.println("indexOfY = " + indexOfY);
        boolean startWithS = name.startsWith("S");
        System.out.println("startWithS = " + startWithS);
        boolean endWithZ = name.endsWith("k");
        System.out.println("endWithZ = " + endWithZ);

    }
}
