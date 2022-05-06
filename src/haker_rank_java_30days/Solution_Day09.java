package com.raj.may2021core.hakaraank30days;

import java.util.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

   public static int factorial(int n) {
      // Write your code here
       if (n == 0)
           return 1;
       else
           return(n * factorial(n-1));
   }

}
    public class Solution_Day09 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            sc.nextLine();

           int result = Result.factorial(n);

            System.out.println(result);
            sc.close();
        }
    }
