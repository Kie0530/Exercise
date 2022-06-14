package Main.Java.DataStructureandAlgorithm;
import java.util.*;

public class JosephusProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // N, K 받기
        int num = sc.nextInt();
        int mark = sc.nextInt();


        // Queue로 풀기

        // 1부터 num까지의 수로 queue 채우기
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= num; i++) {
            queue.offer(i);
        }

        // 반복시 사용할 카운트 생성
        int count = 0;
        // 반환할 결과값 생성
        String res = "<";
        // queue가 빌 때까지
        while (!queue.isEmpty()) {
            count++;
            // 카운트가 주어진 mark수와 같을 경우 결과값에 추가하고 카운트 초기화
            if(count == mark) {
                res += queue.poll() + ", ";
                count = 0;
            }
            // 카운트!=mark인 경우 poll한 값을 다시 queue에 추가
            else{
                queue.offer(queue.poll());
            }
        }
        // 결과값 맨뒤의 ", " 제거한 후 부등호로 닫아서 정해진 양식에 맞게 수정
        res = res.substring(0, res.length()-2);
        res += ">";

        System.out.println(res);


    }
}
