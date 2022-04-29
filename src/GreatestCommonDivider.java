import java.util.Scanner;

//// Liang,Y.Daniel. Programming And Data Structures, Pearson, 2020
public class GreatestCommonDivider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();
        int i = 1;
        int greatestDivider = 1;
        while (i <= firstNumber && i <= secondNumber) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                greatestDivider = i;
            }
            i++;
        }
        System.out.println("The greatest divider is: "+greatestDivider);    }
}
