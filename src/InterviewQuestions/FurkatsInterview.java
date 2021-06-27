package InterviewQuestions;

public class FurkatsInterview {
    public static void main(String[] args) {


    }
    public static boolean isPalindrome(String str){

        boolean isPalindrome;

        String[] words = str.split("\\s");

        String outputString = "";

        for (int i = words.length-1; i >= 0; i--)
        {
            outputString = outputString + words[i] + " ";
        }
        if (str.equals(outputString)){
            return isPalindrome = true;
        }else {
            return isPalindrome = false;
        }
    }
}