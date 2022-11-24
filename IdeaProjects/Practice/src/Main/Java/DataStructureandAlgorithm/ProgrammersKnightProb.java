package Main.Java.DataStructureandAlgorithm;

public class ProgrammersKnightProb {
    public static void main(String[] args) {
        System.out.println("naive solution : " + programmersKnightSol1(5,3,2));
        System.out.println("naive solution : " + programmersKnightSol1(10,3,2));
        System.out.println("quick solution : " + programmersKnightSol2(5,3,2));
        System.out.println("quick solution : " + programmersKnightSol2(10,3,2));
    }
    public static int programmersKnightSol1 (int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i <= number; i++) {
            int one = 1, count = 0;
            //naive한 약수 개수 구하기
            while(one <= i) {
                if(i % one == 0) {
                    count++;
                }
                one++;
            }
            if(count <= limit) {
                answer += count;
            } else {
                answer += power;
            }
        }
        return answer;
    }

    public static int programmersKnightSol2(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i <= number; i++) {
            int count = getGFG(i);
            if(count <= limit) answer += count;
            else answer += power;
        } return answer;
    }

    public static int getGFG(int n) {
        int count = 0;
        for(int i=1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if (n / i == i)
                    count++;
                else
                    count += 2;
            }
        }
        return count;
    }
}
