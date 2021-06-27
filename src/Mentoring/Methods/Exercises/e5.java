package Mentoring.Methods.Exercises;

public class e5 {
    public static void main(String[] args) {

        int i = countWords("selam arkadaslar nasilsiniz bu bir deneme yayinidir");
        System.out.println("words = " + i);

//        5. Write a Java method to count all words in a string.
//Test Data:
//Input the string: The quick brown fox jumps over the lazy dog.
//Expected Output:
//
//Number of words in the string: 9

    }
    public static int countWords(String str){
        int counter = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) ==' '){
                counter++;

            }
        }
        return counter;
    }
}
