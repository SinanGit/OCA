package OCA_PREP;

public class Q107 {

        int x, y;
        public Q107(int x , int y ) {
            initialize ( x , y ) ;
        }
        public void initialize ( int x , int y ) {
            this.x = x * x;
            this.y = y * y;
        }
        public static void main ( String [] args ) {
            int x = 3 , y = 5;
            Q107 obj = new Q107( x , y ) ;
            System.out.println ( x + + y) ;
        }
    }

