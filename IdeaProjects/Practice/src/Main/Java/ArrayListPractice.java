package Main.Java;
import java.sql.Array;
import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<String>();

        fruit.add("apple");
        fruit.add("banana");
        fruit.add("melon");
        fruit.add("lemon");

        int size = fruit.size();

        for(int i = 0; i < size; i++) {
            String str = fruit.get(i);
            System.out.println(i + " : " + str);
        }

        fruit.remove(0);

        Iterator<String> iterator = fruit.iterator();

        while(iterator.hasNext()){
            String str = iterator.next();
            if(str.equals("banana")){
                iterator.remove();
            }
        }
        System.out.println(fruit.subList(0,2)); // 출력: [melon, lemon]
    }
    {


    }
}
// 출력
// 0 : apple
// 1 : banana
// 2 : melon
// 3 : lemon

