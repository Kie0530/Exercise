package Main.Java.DataStructureandAlgorithm;
import java.util.*;
import java.util.stream.Collectors;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[]{44, 1, 0, 0, 31, 25};
        int[] win_num = new int[]{31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(lotto(lotto,win_num)));
        //[3, 5]

        int[] lotto2 = new int[]{0,0,0,0,0,0};
        int[] win_num2 = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(lotto(lotto2,win_num2)));
        //[1, 6]
    }
    public static int[] lotto(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        map.put(6,1);
        map.put(5,2);
        map.put(4,3);
        map.put(3,4);
        map.put(2,5);
        map.put(1,6);
        map.put(0,6);

        List<Integer> list = Arrays.stream(win_nums).boxed().collect(Collectors.toList());

        int count = 0;
        int zero = 0;
        for(int num : lottos) {
            if(num == 0) {
                zero++;
            }
            if(list.contains(num)) {
                count++;
            }
        }
        answer[0] = map.get(count+zero);
        answer[1] = map.get(count);

        return answer;
    }
}