package collections.single_duplicates;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayList_LinkedList_Concept {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(); // ArrayList is good for Read performance and less Memory
        //LinkedList<String> students = new LinkedList<>(); // LinkedList is good for modify performance but more memory
        students.add("Ram");
        students.add("Sita");
        students.add("Hari");
        students.add("Manju");
        students.add("Ramesh");

        // Size of the collection
        System.out.println("Total number of students: " + students.size());

        // Item from specific index
        String lastStudent = students.get(4);
        System.out.println("The last student is: " + lastStudent);

        // find specific index
        students.set(2, "Kiran");
        System.out.println("Student in second position: " + students.get(2));

        // find the items index
        int itemNo = students.indexOf("Sita");
        System.out.println("Index of sita is: " + itemNo);

        // remove item
        students.remove(1);
        System.out.println("1st index (Sita) is successfully deleted.");

        // remove by name
        students.remove("Manju");
        System.out.println("Name 'Manju' is successfully removed.");

        // list using iterator
        System.out.println("List of students using iterator: ");
        Iterator<String> sts = students.iterator();
        while (sts.hasNext()) {
            String student = sts.next();
            System.out.println(student);
        }

        // list using for loop
        System.out.println("List of student using for loop: ");
        for (String s : students) {
            System.out.println(s);
        }

    }

}
