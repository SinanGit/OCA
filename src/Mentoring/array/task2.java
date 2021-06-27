package Mentoring.array;

import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
   /*
        create scanner and output should be how many points you will get.

        Speed limit = 25 MPH
        Speeding 1-10 MPH over limit    3 points
        Speeding 11- 20 MPH over limit    4 points
        Speeding 21- 30 MPH over limit    6 points
        Speeding 31-40 MPH over limit    8 points
        Speeding 41+ MPH over limit    11 points

        */
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
int limit = 25;

            if (speed >limit && speed<=limit+10){
                System.out.println("3 points");

            }else if (speed >limit && speed<=limit+20){
                System.out.println("4 points");

            }else if (speed >limit && speed<=limit+30){
                System.out.println("6 points");
            }else if (speed >limit && speed<=limit+40){
                System.out.println("8 points");
            }else {
                System.out.println("11 points");
            }
            
        }
    }

