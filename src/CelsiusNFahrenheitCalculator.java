package practice;

import java.util.Scanner;

public class CelsiusNFahrenheitCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String runAgain = "y";
        while(runAgain.equalsIgnoreCase("y")) {
        System.out.print("To convert celsius to fahrenheit enter 'C' \n" +
                "and to convert fahrenheit to celsius enter: 'F' : ");
        String input = sc.next();
            if (input.equalsIgnoreCase("c")) {
                System.out.print("Enter the Celsius value: ");
                double celsiusValue = sc.nextDouble();
                double resultCToF = Math.round(((celsiusValue * 9) / 5) + 32);
                System.out.println("The result is: " + resultCToF);
            } if (input.equalsIgnoreCase("f")) {
                System.out.print("Enter the Fahrenheit value: ");
                double fahrenheitValue = sc.nextDouble();
                double resultFToC = Math.round((5/9) * (fahrenheitValue - 32));
                System.out.println("The result is: " + resultFToC);
            } else {
                System.out.println("Invalid entry.");
            }
            System.out.println("Press and enter 'y' to run it again and other keys to exit. ");
            runAgain = sc.next();
        }
        }
}
