package collections.pair;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_LinkedHashMap_HashMap_Concept {
    public static void main(String[] args) {

//        TreeMap<String, Integer> studentGrade = new TreeMap<>(); // It is good to sort items, slow performance
        LinkedHashMap<String, Integer> studentGrade = new LinkedHashMap<>(); // order and good for fast performance
//        HashMap<String, Integer> studentGrade = new HashMap<>(); // It is good to null kay/value allowed and fast performance/ unordered
        studentGrade.put("Ram", 50);
        studentGrade.put("Sita", 60);
        studentGrade.put("Hari", 85);
        studentGrade.put("Kiran", 90);

        // size
        System.out.println("Number of Students: " + studentGrade.size());
        //remove an item
        studentGrade.remove("Ram");
        System.out.println("Number of Students after Removing 1: " + studentGrade.size());
        //value by key
        System.out.println("Value by key: " + studentGrade.get("Sita"));
        // check if exits
        if (studentGrade.containsKey("Kiran")) {
            System.out.println("The student name kiran exists in the list.");
        }
        // printing all key-value
        System.out.println(studentGrade);

        // output using for loop
        System.out.println("\nOutput using for each loop");

        for (Map.Entry<String, Integer> s : studentGrade.entrySet()) {
            System.out.println(s.getKey() + "\t" + s.getValue());
        }

    }

}
