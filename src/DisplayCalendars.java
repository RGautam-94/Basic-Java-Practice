package practice;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class DisplayCalendars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        printMonth(year);
    }

    static void printMonth(int year) {
        for (int month = 1; month < 13; month++) {

            YearMonth monthYear = YearMonth.of(year, month);

            System.out.println("\n\n\t\t" + numberToMonths(month) + " " + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
            System.out.println("----------------------------");
            int counter = 1;

            int dayValue = LocalDate.of(year, month, 1).getDayOfWeek().getValue();
            if (dayValue != 7)
                for (int i = 0; i < dayValue; i++, counter++) {
                    System.out.printf("%-4s", "");
                }

            for (int i = 1; i <= monthYear.getMonth().length(monthYear.isLeapYear()); i++, counter++) {
                System.out.printf("%-4d", i);

                if (counter % 7 == 0) {
                    System.out.println();
                }
            }
        }
    }

    static String numberToMonths(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return null;
    }

}