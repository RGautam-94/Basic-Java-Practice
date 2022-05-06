package practice;

import java.util.Scanner;

public class SubtractionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        long startTime = System.currentTimeMillis();
        int wrongCount = 0;
        int correctCount = 0;
        int count = 0;
        String output = "";
        Scanner sc = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            //To swap number if number1 is less than number2
            if (number1 < number2) {
                int tempNumber = number1;
                number1 = number2;
                number2 = tempNumber;
            }
            System.out.print("What is " + number1 + " - " + number2 + "?: ");
            int answer = sc.nextInt();
            if (answer == (number1 - number2)) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong. \n " + number1 + " - " + number2 +
                        " should be " + (number1 - number2));
                wrongCount++;
            }
            count++;
            output += "\n" + number1 + " - " + number2 + "= " + answer +
                    ((number1-number2==answer)?" correct":" wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount + "\nWrong count is " + wrongCount + "\nTest time is " + testTime / 1000 + " seconds."+output);
    }
}
