package collections.single_unique;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_LinkedHashSet_HashSet_Concept {
    public static void main(String[] args) {
        Student s1 = new Student("Ram Sharma", 5);
        Student s2 = new Student("Sita Upadhyay", 2);
        Student s3 = new Student("Hari Pande", 5);
        Student s4 = new Student("Kiran Barma", 4);
        Student s5 = new Student("Ram Sharma", 5);

        HashSet<Student> hashSet = new HashSet<>(); // Doesn't allowed duplicate entry
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        hashSet.add(s5);

        System.out.println("***** HashSet Result *********");
        System.out.println("Total Student: " + hashSet.size());
        System.out.println("Grade\tName");
        for (Student s : hashSet) {
            System.out.println(s.grade + " \t    " + s.name);
        }
        Set<Student> linkedHashSet = new LinkedHashSet<>(); // It is used to keep on order
        linkedHashSet.add(s1);
        linkedHashSet.add(s2);
        linkedHashSet.add(s3);
        linkedHashSet.add(s4);
        linkedHashSet.add(s5);

        System.out.println("\n***** LinkedHashSet Result *********");
        System.out.println("Total Student: " + linkedHashSet.size());
        System.out.println("Grade\tName");
        for (Student s : linkedHashSet) {
            System.out.println(s.grade + " \t    " + s.name);
        }
        Set<Student> treeSet = new TreeSet<>(); // It is used to sort elements
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);

        System.out.println("\n***** TreeSet Result *********");
        System.out.println("Total Student: " + treeSet.size());
        System.out.println("Grade\tName");
        for (Student s : treeSet) {
            System.out.println(s.grade + " \t    " + s.name);
        }
    }
}
