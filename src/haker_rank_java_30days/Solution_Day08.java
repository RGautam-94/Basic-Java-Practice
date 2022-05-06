package hakaraank30days;

import java.util.*;
import java.io.*;

class Solution_Day08{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            hashMap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(hashMap.containsKey(s)){
                System.out.println(s +"="+hashMap.get(s));
            }else{
                System.out.println("Not found.");
            }

        }
        in.close();
    }
}