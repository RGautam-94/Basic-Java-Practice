package com.raj.may2021core.hakaraank30days;
import java.io.*;

import static java.util.stream.Collectors.joining;

public class Solution_Day02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if (N%2==1){
            System.out.println("Weird");
        }
        else if (N>=2 && N <=5) {
            System.out.println("Not Weird");
        }
        else if (N <=20) {
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }

        bufferedReader.close();
    }
}
