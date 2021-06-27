package Mentoring.Methods.Exercises;

public class e3 {
    public static void main(String[] args) {

        String s = middleChar("356078");
        System.out.println(s);
//        3. Write a Java method to display the middle character of a string.
//Note: a) If the length of the string is odd there will be two middle characters.
//b) If the length of the string is even there will be one middle character.
//Test Data:
//Input a string: 350
//Expected Output:
//The middle character in the string: 5
    }
    public static String middleChar(String str){

        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }

}
