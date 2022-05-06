package practice;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String firstCity = sc.nextLine();
        System.out.print("Enter the second city: ");
        String secondCity = sc.nextLine();
        if(firstCity.compareTo(secondCity)<0){
            System.out.println("The cities in alphabetical order are: " +firstCity + ", " +secondCity);
        }else{
            System.out.println("The cities in alphabetical order are: " +secondCity+ ", " + firstCity);
        }
    }

}
