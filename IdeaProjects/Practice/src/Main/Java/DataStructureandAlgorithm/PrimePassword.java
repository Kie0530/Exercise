package Main.Java.DataStructureandAlgorithm;

/**
 * curPwd -> newPwd로 한 자리씩 바꾸는데 필요한 동작의 수 구하기.
 * 특정 자리의 수를 바꾸고자 할 때, 전체 수가 소수여야 변경 가능.
 * */

public class PrimePassword {
    public static void main(String[] args) {
        int cur = 3733;
        int goal = 8779;
        System.out.println(primePassword(cur, goal)); // 3

        int cur2 = 1033;
        int goal2 = 1033;
        System.out.println(primePassword(cur2, goal2)); // 0

        int cur3 = 9787;
        int goal3 = 9923;
        System.out.println(primePassword(cur3, goal3));
    }
    public static int primePassword(int curPwd, int newPwd) {
        // TODO:
        int count = 0;
        // 동일한 경우
        if (curPwd == newPwd) return 0;
        // 한 자리씩 체크 - 한 자리씩 비교하고, 덧입혀야 되므로 StringBuilder 사용 (setCharAt)
        StringBuilder cur = new StringBuilder(String.valueOf(curPwd));
        StringBuilder goal = new StringBuilder(String.valueOf(newPwd));
        // 자리 별 비교
        for (int i = goal.length()-1; i >= 0; i--) {
            if (goal.charAt(i) != cur.charAt(i)) {
                cur.setCharAt(i, goal.charAt(i));
                if (isPrime(Integer.parseInt(String.valueOf(cur))) == true) {
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        } return true;
    }
}

