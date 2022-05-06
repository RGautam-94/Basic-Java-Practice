package practice;

import java.util.Scanner;

public class HexDigit2Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex digit : ");
        String hexString = sc.nextLine();
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character ");
            System.exit(1);
        }
        char ch = Character.toUpperCase(hexString.charAt(0));
        if ('A' <= ch && ch <= 'F') {
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit: " + ch + " is " + value);
        } else if (Character.isDigit(ch)) {
            System.out.println("The decimal value for hex digit : " + ch + " is " + ch);
        } else {
            System.out.println(ch + " is an invalid input.");
        }
    }
}