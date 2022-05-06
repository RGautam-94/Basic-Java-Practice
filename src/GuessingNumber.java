package practice;

import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        System.out.println("Guess a magic number between 0 and 100");
        int number = (int) (Math.random() * 101);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess number: ");
        int guessNumber = sc.nextInt();
        while (number != guessNumber) {
            if (guessNumber < number) {
                System.out.println("Your guess number is too low.");
            } else if (guessNumber > number) {
                System.out.println("Your guess number is too high.");
            }
            System.out.print("Enter your guess number: ");
            guessNumber = sc.nextInt();
        }
        System.out.println("You got it! The guess number is: " +number);
    }
}
