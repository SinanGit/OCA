package OCA_PREP.Q91;

public class Q91 {
    public static void main(String[] args) {
        Short s1 = 200;
        Integer s2 = 400;
        //String s3 = String (s1+s2);
        Long s4 = (long) s1+s2;
        System.out.println("Sum is " + s4);
    }
}
/*What is the result?
A.	Sum is 600
B.	Compilation fails at line n1.
C. Compilation fails at line n2.
D.	A ClassCastException is thrown at line n1.
E.	A ClassCastException is thrown at line n2.
*/
