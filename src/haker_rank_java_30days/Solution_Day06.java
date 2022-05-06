package hakaraank30days;

import java.util.Scanner;

public class Solution_Day06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();
        sc.nextLine();

        while (n > 0) {
            String str = sc.nextLine();

            StringBuilder evenStr = new StringBuilder();
            StringBuilder oddStr = new StringBuilder();
            char chars[] = str.toCharArray();

            for (int i = 0; i < str.length(); i++) {

                if (i % 2 == 0) {
                    evenStr.append(chars[i]);
                } else {
                    oddStr.append(chars[i]);
                }

            }
            evenStr.append(" ");
            evenStr.append(oddStr);
            System.out.println(evenStr);

            n--;
        }
        sc.close();
    }
}
