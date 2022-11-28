package Main.Java.DataStructureandAlgorithm;

import java.util.*;

public class ProgrammersTangerine {
    public static void main(String[] args) {
        int[] tangerines = new int[]{1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution(6, tangerines)); // ans = 3
        int[] tangerines2 = new int[]{1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution(4, tangerines2)); // ans = 2
    }

    public static int solution(int k, int[] tangerine) {
        int ans = 0;
        Map<Integer, Integer> types = new HashMap<>();

        // 귤 종류에 따른 개수 저장
        for(int t : tangerine) {
            types.put(t, types.getOrDefault(t, 0) + 1);
        }

        // 개수 많은 순 정렬 후 k개 맞출 때까지 가지 수 증가시키기
        List<Integer> sizes = new ArrayList<>(types.values());
        sizes.sort((o1, o2) -> o2 - o1);
        int count = 0;
        for (int i = 0; i < sizes.size(); i++) {
            count += sizes.get(i);
            ans++;
            if (count >= k) {
                return ans;
            }
        }
        return ans;
    }
}
