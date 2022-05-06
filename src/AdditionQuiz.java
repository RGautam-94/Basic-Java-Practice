package practice;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        System.out.print("What is sum of " + number1 + " and " + number2 + "? : ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        while (number1 + number2 != answer) {
            System.out.print("Wrong Answer. Please try again.\n");
            System.out.print("What is sum of " + number1 + " and " + number2 + "? :");
            answer = sc.nextInt();
        }
        System.out.println("You got it. Thank you!");

    }
}
