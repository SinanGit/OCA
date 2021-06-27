package Mentoring;

public class replace {
    public static void main(String[] args) {
        int num = 200;
        String num2 = "%100";
        num2 = num2.replace("%","");
        int num3 = Integer.parseInt(num2);
        boolean isEqual = num==num3;
        System.out.println(isEqual);
    }
}
