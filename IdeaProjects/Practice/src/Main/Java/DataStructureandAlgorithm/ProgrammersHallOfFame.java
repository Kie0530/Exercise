package Main.Java.DataStructureandAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProgrammersHallOfFame {
    public static void main(String[] args) {
        int[] score = new int[]{10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(hallOfFame(3, score)));
    }

    public static int[] hallOfFame(int k, int[] score) {
        int[] ans = new int[score.length];
        List<Integer> hof = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            // k번째 날까지 도달하지 않은 경우
            if (i < k) {
                hof.add(score[i]);
                hof.sort(Collections.reverseOrder());
                ans[i] = hof.get(hof.size() - 1);
            }
            // k번째 날을 경과한 경우
            if (i >= k) {
                hof.add(score[i]);
                hof.sort(Collections.reverseOrder());
                ans[i] = hof.get(k - 1);
            }
        }
        return ans;
    }
}
