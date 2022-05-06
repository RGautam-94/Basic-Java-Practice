import java.util.ArrayList;
import java.util.List;

interface StringInterface {
    String run(String string);
}

public class LambdaExpressionConcept {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Krishna");
        names.add("Pal");
        names.add("Frank");
        names.add("John");
        System.out.println("The name list is as follows: ");
        names.forEach(n -> System.out.println(n));

        // lambda expression with parameter
        System.out.println("\n");

        StringInterface exclamationSign = (e) -> e + "!";
        StringInterface questionMark = (q) -> q + "?";

        print("Hello", exclamationSign);
        print("How are you", questionMark);

    }

    public static void print(String str, StringInterface face) {
        String signs = face.run(str);
        System.out.println(signs);
    }
}



