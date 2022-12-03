package Main.Java.DataStructureandAlgorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ProgrammersRollcake {
    public static void main(String[] args) {
        int[] toppings = new int[]{1, 2, 1, 3, 1, 4, 1, 2};
        System.out.println(solution(toppings)); // answer = 2
        int[] toppings2 = new int[]{1, 2, 3, 1, 4};
        System.out.println(solution(toppings2)); // answer = 0

        // solution2 is three times faster.
        System.out.println(solution2(toppings)); // answer = 2
        System.out.println(solution2(toppings2)); // answer = 0

    }

    public static int solution(int[] toppings) {
        int answer = 0;
        for (int i = 1; i < toppings.length-2; i++) {
            int[] head = Arrays.copyOfRange(toppings, 0, i);
            int[] tail = Arrays.copyOfRange(toppings, i, toppings.length);
            Set<Integer> set1 = Arrays.stream(head).boxed().collect(Collectors.toSet());
            Set<Integer> set2 = Arrays.stream(tail).boxed().collect(Collectors.toSet());
            if (set1.size() == set2.size()) {
                answer++;
            }
        }
        return answer;
    }

    public static int solution2(int[] toppings) {
        int answer = 0;

        int[] head = new int[toppings.length];
        int[] tail = new int[toppings.length];

        Set<Integer> sort = new HashSet<>();

        for(int i = 0; i < toppings.length; i++) {
            sort.add(toppings[i]);
            head[i] = sort.size();
        }

        sort.clear();

        for(int j = toppings.length-1; j >= 0; j--) {
            sort.add(toppings[j]);
            tail[j] = sort.size();
        }

        for (int i = 0; i < toppings.length - 1; i++) {
            if (head[i] == tail[i + 1]) {
                answer++;
            }
        }
        return answer;
    }
}
