package practice;

import java.util.Scanner;

public class TimeInHrMinutesSeconds {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter time in seconds: ");
        // Declaring variables
        int seconds = sc.nextInt();
        int hours;
        int minutes;
        int remainingSeconds;

        //Converting seconds to hours
        hours = seconds/(int)(Math.pow(60,2));
        //Remaining Minutes
        minutes = (seconds%(int)(Math.pow(60,2)))/60;
        //Remaining seconds
        seconds=seconds%60;

        System.out.println("The result is: \nHours: "+hours +", minutes: "+minutes+", seconds: "+seconds);

    }


}
