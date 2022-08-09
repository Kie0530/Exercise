package Main.Java.DataStructureandAlgorithm;

public class LPS {
    public static int solution(String str) {
        int start = 0;
        int mid = str.length()/2;
        if(str.length() < 2) return 0;
        while(mid < str.length()) {
            if(str.charAt(start) == str.charAt(mid)) {
                start++;
                mid++;
            } else {
                mid = mid - start + 1;
                start = 0;
            }
        } return start;
    }

    public static void main(String[] args) {
        String str = "aaaa";
        System.out.println(solution(str)); // 2

        String str2 = "abceabc";
        System.out.println(solution(str2)); // 3
    }
}
