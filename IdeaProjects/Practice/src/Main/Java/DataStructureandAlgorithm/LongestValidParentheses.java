package Main.Java.DataStructureandAlgorithm;
import java.util.Arrays;
import java.util.Stack;

public class LongestValidParentheses {
        public static int longestValidParentheses(String s) {
            Stack<Integer> stack = new Stack();
            stack.push(-1);
            int max = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '('){
                    stack.push(i);
                }else if(s.charAt(i) == ')'){
                    stack.pop();
                    if(stack.empty()){
                        stack.push(i);
                    }else{
                        max = Math.max(max, i - stack.peek());
                    }
                }
            }
            return max;
        }

    public static void main(String[] args) {
        String test = ")()())";
        System.out.println(longestValidParentheses(test)); //4

        String test2 = "((()))()())(";
        System.out.println(longestValidParentheses(test2)); //10
    }
}

