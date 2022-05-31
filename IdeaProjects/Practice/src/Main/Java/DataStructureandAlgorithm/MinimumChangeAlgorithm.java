package Main.Java.DataStructureandAlgorithm;

public class MinimumChangeAlgorithm {
    public static void main(String[] args) {
        System.out.println(minimumChange(5000)); // 10
        System.out.println(minimumChange(800)); // 4
        System.out.println(minimumChange(17526)); // 39
    }

    public static int minimumChange(int change) {
        // TODO:
        // count 선언
        int count = 0;
        // 동전을 배열에 초기화해준다.
        int[] coin = {1, 5, 10, 50, 100, 500};
        // for 배열 순회 (가장 큰 동전부터)
        for (int i = coin.length - 1; i >= 0; i--) {
            // 가장 큰 수부터 잔돈에서 계속 차감한다. 잔돈이 가장 큰 동전보다 크거나 같을 동안 반복한다.
            while (change >= coin[i]) {
                change -= coin[i];
                count++;
            }
        }
        return count;
    }
}
