package calisma;

public class monkey {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(false,false));

    }

        public static boolean monkeyTrouble ( boolean aSmile, boolean bSmile){

            if (aSmile && bSmile){
                return true;
            }else if(!aSmile && !bSmile){
                return true;
            }else {
                return false;
            }

        }

    }