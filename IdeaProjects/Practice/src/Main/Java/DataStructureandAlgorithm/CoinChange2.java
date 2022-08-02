package Main.Java.DataStructureandAlgorithm;

import java.util.Arrays;

public class CoinChange2 {
    public static int solution(int[] coins, int total) {
        int[] arr = new int[total+1];
        Arrays.fill(arr, 0);
        arr[0] =1;
        for( int c : coins) {
            for(int j = c; j <= total; j++) {
                arr[j] += arr[j-c];
            }
        } return arr[total];
    }

    public static void main(String[] args) {
        int[] coins = new int[]{1,2,3};
        int total = 4;
        System.out.println(solution(coins, total));
        // 출력: 4
        // 1+1+1+1 1+1+2 2+2 1+3

        int[] coins2 = new int[]{2};
        int total2 = 3;
        System.out.println(solution(coins2, total2));
        // 출력: 0
    }
}
