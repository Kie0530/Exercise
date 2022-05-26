package Main.Java;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class QueueE {
    private ArrayList<Integer> listQueue = new ArrayList<>();

    public void add(Integer num){
        listQueue.add(num);
    }
    public Integer pull() {
        if(listQueue.size() == 0) return null;
        return listQueue.remove(0);
    }
    public int size() {
        return listQueue.size();
    }
    public Integer peek() {
        return listQueue.get(0);
    }
    public String show() {
        return listQueue.toString();
    }
    public void clear() {
        listQueue.clear();
    }

}
public class QueuePractice {
    public static void main(String[] args) {
        QueueE queue = new QueueE();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.show()); // [1, 2, 3, 4, 5]

        queue.pull(); // 1 꺼내기
        queue.pull(); // 2 꺼내기

        System.out.println(queue.show()); // [3, 4, 5];
    }
}
