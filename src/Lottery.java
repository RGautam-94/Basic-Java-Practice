package practice;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = sc.nextInt();

        Lottery lottery = new Lottery();
        lottery.calculateLottery(guess);
    }

    private void calculateLottery(int guess) {
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        int lotteryNumber = (int) (Math.random() * 100);
        int lotteryDigit1 = lotteryNumber / 10;
        int lotteryDigit2 = lotteryNumber % 10;

        System.out.println("The lottery number is : " + lotteryNumber);

        if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2) {
            System.out.println("Exact match: You won $10,000. Congratulations!!!");
        } else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) {
            System.out.println("Match both digits. You won $3000. Congratulations!!!");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit. You won $1000");
        } else {
            System.out.println("Sorry. No match.");
        }

    }


}
