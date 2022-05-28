package Main.Java;
import java.util.*;

public class ComparatorPractice {
    public static void main(String[] args) {
        String[] arr = {"apple", "Banana", "melon", "grape"};

        Arrays.sort(arr);
        System.out.println("arr = "+Arrays.toString(arr));

        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("arr = "+Arrays.toString(arr));

        Arrays.sort(arr, new Descending());
        System.out.println("arr = "+Arrays.toString(arr));
    }
    static class Descending implements Comparator { //static을 넣자 new Descending()에 에러가 사라졌다. public도 default도 아닌 static이 해결해준 이유는 뭘까?
        public int compare(Object o1, Object o2) {
            if(o1 instanceof Comparable && o2 instanceof Comparable) {
                Comparable c1 = (Comparable) o1;
                Comparable c2 = (Comparable) o2;
                return c1.compareTo(c2)*-1;
            }
            return -1;
        }

    }
}
