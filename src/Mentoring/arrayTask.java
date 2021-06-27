package Mentoring;

public class arrayTask {
    public static void main(String[] args) {

        int [] arr = {10, 2, 3, 5, 9, 11, 13, 14, 78, 109, 200};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                sum +=arr[i];
            }

        }
        System.out.println(sum);

    }
}
