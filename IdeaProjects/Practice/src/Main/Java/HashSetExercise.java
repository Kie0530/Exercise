package Main.Java;
import java.util.*;

public class HashSetExercise {
    public static void main(String[] args) {
        HashSet<String> languages = new HashSet<String>();

        languages.add("Java");
        languages.add("Java");
        languages.add("Kotlin");
        languages.add("C");

        Iterator it = languages.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
