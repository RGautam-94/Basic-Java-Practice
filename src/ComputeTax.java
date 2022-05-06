package practice;

import java.util.Scanner;

public class ComputeTax {
    private double tax = 0;

    public static void main(String[] args) {
        ComputeTax computeTax = new ComputeTax();
        Scanner sc = new Scanner(System.in);
        System.out.println("The tax calculation is for a single status.");
        System.out.print("Enter the taxable income: ");
        double income = sc.nextDouble();
        computeTax.getTaxForSingle(income);
    }

    public void getTaxForSingle(double income) {
        if (income <= 8350) {
            tax = 8350 * 0.10;
        } else if (income <= 33950) {
            tax = (8350 * 0.10) + (income - 8350) * 0.15;
        } else if (income <= 82250) {
            tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + (income - 33950) * 0.25;
        } else if (income <= 171550) {
            tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((82225 - 33950) * 0.25) + (income - 171550) * 0.28;
        } else if (income <= 372950) {
            tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((82225 - 33950) * 0.25) + (171550 - 82225) * 0.28 +
                    (income - 171550) * 0.33;
        } else if (income <= 400000) {
            tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((82225 - 33950) * 0.25) + (171550 - 82225) * 0.28 +
                    (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
        }
        System.out.printf("Tax is : " + "%.2f", tax);
    }

}
