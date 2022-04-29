public class PrimeNumberMethod {
    int count = 0;
    int number = 2;

    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are");
        printPrimeLines(50);
    }

    public static void printPrimeLines(int numbersOfPrimes) {
        int count = 0;
        int number = 2;
        while (count < numbersOfPrimes) {
            if (isPrime(number)) {
                count++;
                if (count % 10 == 0) {
                    System.out.printf("%-5d\n", number);
                } else {
                    System.out.printf("%-5d", number);
                }
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
