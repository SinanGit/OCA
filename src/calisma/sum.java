package calisma;

public class sum {
    public static void main(String[] args) {

        System.out.println(sumDouble(6,9));
    }

    public static int sumDouble(int a, int b) {

        int sum = a+b;
        if (a == b) {
            sum *=2;
        }
        return sum;
    }

}

