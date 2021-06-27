package Mentoring.Methods.Exercises;

public class e4 {
    public static void main(String[] args) {

        int vowels = vowels("Selam arkadaslar nasilsiniz bu bir deneme yazisidir.");
        System.out.println("vowels = " + vowels);

    }
//    4. Write a Java method to count all vowels in a string.
//Test Data:
//Input the string: w3resource
//Expected Output:
//
//Number of  Vowels in the string: 4
    public static int vowels(String str){
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
             counter++;
            }
        }
return counter;
    }
}
