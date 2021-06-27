package Basics.StringMethods;

public class lastIndexOf {
    public static void main(String[] args) {
        String str = "Hello World !";
        int lastIndexOf = str.lastIndexOf(" ");
        System.out.println("lastIndexOf = " + lastIndexOf);
        String lastWord = str.substring(lastIndexOf);
        System.out.println("lastWord = " + lastWord);

    }
}
