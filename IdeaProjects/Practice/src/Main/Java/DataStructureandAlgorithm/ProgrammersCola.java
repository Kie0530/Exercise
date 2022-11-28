package Main.Java.DataStructureandAlgorithm;

public class ProgrammersCola {
    public static void main(String[] args) {
        System.out.println(solution(2, 1, 20)); // ans = 19
        System.out.println(solution(3,1,20)); // ans = 9
    }
    public static int solution(int a, int b, int n) {
        int ans = 0;

        while(true) {
            if(n<a) {
                break;
            }
            ans += (n / a) * b;
            int count = n % a;
            n = (n / a) * b + count;
        }
        return ans;
    }
}
