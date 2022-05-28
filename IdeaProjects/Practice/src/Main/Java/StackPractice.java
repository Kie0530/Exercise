package Main.Java;
import java.util.*;

class StackPracticeTest {
    ArrayList<Integer> arrayStack = new ArrayList<>();

    public void push(int num) {
        arrayStack.add(num);
    }
    public Integer pop() {
        if(arrayStack.size() == 0) return null;

        return arrayStack.remove(arrayStack.size()-1);
    }
    public String show() {
        return arrayStack.toString();
    }
    public Integer peek() {
        return arrayStack.get(arrayStack.size()-1);
    }

}
public class StackPractice {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

       // System.out.println(stack.show());
        System.out.println(stack.search(3)); // 3
        System.out.println(stack.size()); // 5

        System.out.println(stack.peek()); // 5

        System.out.println(stack.pop()); // 5
        System.out.println(stack.pop()); // 4
        System.out.println(stack.pop()); // 3


    }
}