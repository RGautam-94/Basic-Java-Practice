package practice;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer. Input will end if it is 0 : ");
        int input = sc.nextInt();
        int sum =0;
        while (input!=0){
            sum +=input;
            System.out.print("Enter an integer. Input will end if it is 0 : ");
            input = sc.nextInt();
        }

        System.out.println("The sum is : " + sum);
    }
}
