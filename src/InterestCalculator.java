package practice;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = sc.nextDouble();
        System.out.print("Number of Years: ");
        double numberOfYears = sc.nextDouble();
        System.out.printf("\nInterest Rate\t Monthly Payment \t Total Amount\n");
        interestRate(loanAmount,numberOfYears);
    }

    public static void interestRate(double p, double t) {
        for (double i = 5; i <=8; i+=(1/8.0)) {
            double interest = 0.0;
            interest = (p*t*i)/100;
            double totalAmountToPay = p+interest;
            double monthlyAmount = totalAmountToPay/(t*12);
            System.out.printf(String.format("%.3f", i )+"\t\t\t\t"+ String.format("%.2f", monthlyAmount)  +"\t\t\t\t"+String.format("%.2f", totalAmountToPay));
            System.out.println();
        }

    }
}
