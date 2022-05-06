package practice;

public class Strings_Some_Methods {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";

        System.out.println(s1 == s2); //false
        System.out.println(s2 == s3);//false
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.compareTo(s2)); //7
        System.out.println(s2.compareTo(s3)); //-7
        System.out.println(s2.compareTo(s2)); //0
        System.out.println(s1.charAt(0)); //W
        System.out.println(s1.indexOf("J")); //11
        System.out.println(s1.indexOf("to")); //8
        System.out.println(s1.lastIndexOf('a')); //14
        System.out.println(s1.lastIndexOf("0",15)); // not match so the value is : -1
        System.out.println(s1.length()); //15
        System.out.println(s1.substring(5));  //me to Java
        System.out.println(s1.substring(5,11)); // me to
        System.out.println(s1.startsWith("Wel")); //true
        System.out.println(s1.endsWith("Java")); //true
        System.out.println(s1.toLowerCase()); // all lower case
        System.out.println(s1.toUpperCase()); // all upper case
        System.out.println(s1.concat(s2)); // Welcome to JavaProgramming is fun
        System.out.println(s1.contains(s2)); //false
        System.out.println("\t Wel \t".trim()); //

    }


}
