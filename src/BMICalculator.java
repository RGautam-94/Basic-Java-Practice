package practice;

import java.util.Scanner;

public class BMICalculator {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pound: ");
        double weightInPound = sc.nextDouble();
        System.out.print("Enter height in inch: ");
        double heightInInch = sc.nextDouble();

        final double GET_WEIGHT_IN_KG = weightInPound * 0.45359237;
        final double GET_HEIGHT_IN_METERS = heightInInch * 0.0254;

        double bmi = GET_WEIGHT_IN_KG / (GET_HEIGHT_IN_METERS * GET_HEIGHT_IN_METERS);

        System.out.printf("Your BMI is : " + "%.2f", bmi);
        System.out.println();
        if (bmi < 18.5) {
            System.out.println("Underweight.");
        } else if (bmi < 25) {
            System.out.println("Your BMI is normal. Congratulations!!");
        } else if (bmi < 30) {
            System.out.println("Overweight.");
        } else {
            System.out.println("Obese");
        }

    }

}
