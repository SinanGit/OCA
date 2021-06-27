package DoWhile;

import java.util.Scanner;

public class DoWhileLoopTask {
    public static void main(String[] args) {

        // ask the user for pin number
        // if the pin number is incorrect keep asking the user for pin number
        // when the pin is correct print out "you are logged in"
        // the correct pin is 3535
        // do this task with do-while


        Scanner scanner = new Scanner(System.in);

        int pin = 3535;
        int userInput = 0;

        do {
            System.out.println("Please enter PIN number: ");
            userInput = scanner.nextInt();
        }while (pin != userInput);
        System.out.println("You are logged in!");
    }
}
