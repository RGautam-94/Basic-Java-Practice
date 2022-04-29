import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a full year: ");
        int year = sc.nextInt();
        System.out.print("Enter month as number between 1 and 12: ");
        int month = sc.nextInt();

        System.out.println("\n" + "\t" + "\t" + getMonth(month) + "   " + year);
        System.out.println("--------------------------------");
        System.out.println("  Sun Mon Tue Wed Thu Fri Sat");
        printMonthBody(year, month);
    }

    private static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        int numberOfMonths = getTotalNumberOfDaysInMonth(year, month);
        int j = 0;
        for (j = 0; j < startDay; j++)
            System.out.print("    ");
        for (j = 1; j <= numberOfMonths; j++) {
            System.out.printf("%4d", j);

            if ((j + startDay) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }

    public static String getMonth(int month) {
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
        return "Invalid Month";
    }

    public static int getStartDay(int year, int month) {
        final int START_DAY_1_JAN_2018 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year, month);
        // return start day
        return (totalNumberOfDays + START_DAY_1_JAN_2018) % 7;
    }

    private static int getTotalNumberOfDays(int year, int month) {
        int totalDays = 0;
        for (int i = 1800; i < year; i++)
            if (isLeapYear(i))
                totalDays = totalDays + 366;
            else totalDays = totalDays + 365;
        for (int i = 1; i < month; i++)
            totalDays = totalDays + getTotalNumberOfDaysInMonth(year, i);
        return totalDays;

    }

    private static int getTotalNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 6 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if (month == 2)
            return isLeapYear(year) ? 29 : 28;
        return 0;
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}



