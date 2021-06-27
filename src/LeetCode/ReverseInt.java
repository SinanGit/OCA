package LeetCode;

public class ReverseInt {
//    Given a signed 32-bit integer x, return x with its digits reversed.
//    If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned)
public static void main(String[] args) {


}
public int reverseInt(int x){

    String reversed="";
    for (int i = x; i>=0; i--) {
        reversed +=i;
    }


    return Integer.parseInt(reversed);
}
}
