package Mentoring;

public class replaceAll {
    public static void main(String[] args) {

        String price = "$1   00Dollars";
        price = price.replaceAll("[$a-zA-Z ]","");
        System.out.println(price);
    }
}
