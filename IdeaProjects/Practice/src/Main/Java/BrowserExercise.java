package Main.Java;
import java.util.*;

public class BrowserExercise {
 //   String [] actions = new String[];

    public static void main(String[] args) {
     //   ArrayList<Stack> browserStack(String[] actions, String start){
            Stack<String> prevStack = new Stack<>();
            Stack<String> nextStack = new Stack<>();
            Stack<String> current = new Stack<>();
            ArrayList<Stack> result = new ArrayList<>();

       //     current.add(start);

      //      for(int i = 0; i < actions.length; i++){
        //        if(actions[i] == String.valueOf(1)){
                    prevStack.push(current.pop());
                    current.push(nextStack.pop());
                }
         //       if(actions[i] == String.valueOf(-1)){
       //             nextStack.push(current.pop());
        //            current.push(prevStack.pop());
                }
          //      prevStack.push(current.pop());
        //        current.push(actions[i]);
       //     }

         //   result.add(prevStack);
         //   result.add(current);
         //   result.add(nextStack);

       //     return result;

     //   }
  //      public ArrayList<Stack> browserStack(String[] actions, String start) {
     //       Stack<String> prevStack = new Stack<>();
      //      Stack<String> nextStack = new Stack<>();
      //      Stack<String> current = new Stack<>();
       //     ArrayList<Stack> result = new ArrayList<>();
            // 수도 코드:
            // 1. 현재 스택에 start 추가
            // 2. actions 값에 따라 다르게 추가할 수 있도록 actions를 도는 for문 작성
            // 3. if문으로 값 따른 처리 만들어주기
            // 3-1. actions 1인 경우 - next를 current에, current를 prev에
            // 3-2. actions -1인 경우 - current를 next에, prev를 current에
            // 3-3. 숫자가 아닌 경우 - current를 prev에, next를 current에, next 초기
            // 4. result에 prev, current, next 차례대로 넣어주기
            // 5. return result;
            // 풀이:


    //   }
  //  }