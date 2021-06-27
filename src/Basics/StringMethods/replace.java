package Basics.StringMethods;

public class replace {
    public static void main(String[] args) {

        String name = "Sinan007 Yorulmaz";
        String replaced = name.replace("Yorulmaz", "YORULMAZ");
        System.out.println("replaced = " + replaced);

        String replaced2 = name.replaceAll("[0-9]", "-");
        System.out.println("replaced2 = " + replaced2);

    }
}
