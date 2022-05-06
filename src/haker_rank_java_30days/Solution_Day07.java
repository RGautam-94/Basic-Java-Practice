package hakaraank30days;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution_Day07 {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        List<Integer> arr = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrTemp[i]);
//            arr.add(arrItem);
//        }
//for (int x =arr.size()-1; x>0; x--){
//    System.out.println(arr.get(x) +" ");
//}
//
//        bufferedReader.close();


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                //.sorted(Collections.reverseOrder())
                .collect(toList());

        for(int i=0; i<n-1; i++){
            int x = Integer.parseInt(bufferedReader.readLine().trim());
            arr.add(x);
        }
        //System.out.println(arr);

        for(int i=(n-1); i>=0; i--){
            System.out.print(arr.get(i)+" ");
        }

        bufferedReader.close();
    }
}
