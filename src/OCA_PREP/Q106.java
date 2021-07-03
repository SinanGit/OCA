package OCA_PREP;

public class Q106 {
    public static void main(String[] args) {
        Q106 ts = new Q106();
        System.out.println(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);

    }

   public static boolean doStuff() {
       return !isAvailable;
   }
    static boolean isAvailable = false;

}

