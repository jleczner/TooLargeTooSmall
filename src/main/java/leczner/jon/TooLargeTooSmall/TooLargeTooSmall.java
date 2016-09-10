package leczner.jon.TooLargeTooSmall;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by jonathanleczner on 9/10/16.
 */
public class TooLargeTooSmall {
    private int secretNumber;
    private int numberOfTries;
    private Scanner scanner;

    public TooLargeTooSmall() {
        secretNumber = new Random().nextInt(100);
        numberOfTries = 0;
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        TooLargeTooSmall tooLargeTooSmall = new TooLargeTooSmall();
        tooLargeTooSmall.promptUser("Guess a number 0-100:");
        int guess = tooLargeTooSmall.getInput();
        tooLargeTooSmall.feedback(guess);
        System.out.println("Congrats. Number of tries: " + tooLargeTooSmall.getNumberOfTries());
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public void promptUser(String prompt) {
        System.out.println(prompt);
    }

    public int getInput() {
        int number = scanner.nextInt();
        numberOfTries++;
        return number;
    }

    public void feedback(int guess) {
        while (guess != secretNumber) {
            if (guess > secretNumber)
                System.out.println("Too large");
            else if (guess < secretNumber)
                System.out.println("Too small");
            else
                return;

            promptUser("Try again: ");
            int input = getInput();
            guess = input;
        }
        return;
    }

}
