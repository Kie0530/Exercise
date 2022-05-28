package Main.Java;
import java.util.*;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<String> coffee = new HashSet<String>();

        coffee.add("americano");
        coffee.add("americano");
        coffee.add("latte");
        coffee.add("espresso");
        coffee.add("cold brew");

        Iterator it = coffee.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    // 출력:
    // espresso
    // americano
    // cold brew
    // latte
}
