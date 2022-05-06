package com.raj.may2021core.hakaraank30days;

import java.io.*;

import static java.util.stream.Collectors.joining;

class Result1 {


    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        Double tip = (meal_cost*tip_percent)/100;
        Double tax = (tax_percent*meal_cost)/100;
        double total_cost =  meal_cost + tax + tip;
        System.out.println(Math.round(total_cost));
    }
}

public class Solution_Day03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result1.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}

