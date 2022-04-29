import java.util.Scanner;

public class SumOfTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int theNumber = sc.nextInt();
        int i = 0;
        int totalSum = 0;
        while (i <= theNumber) {
            totalSum = totalSum + i;
            i++;
        }
        System.out.println(totalSum);
    }
}
