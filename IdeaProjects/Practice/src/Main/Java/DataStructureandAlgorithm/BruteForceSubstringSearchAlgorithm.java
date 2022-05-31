package Main.Java.DataStructureandAlgorithm;
import java.util.*;


public class BruteForceSubstringSearchAlgorithm {
    public static void main(String[] args) {
        System.out.println(search("this test", "is")); // 2
        System.out.println(search("this test", "test")); // 5
        System.out.println(search("this testt", "test")); // 5
        System.out.println(search("this test", "ax")); // 9

    }

    public static int search(String text, String pattern) {

        int lengthOfText = text.length();
        int lengthOfPattern = pattern.length();

        for (int i = 0; i < lengthOfText - lengthOfPattern + 1; i++) {
            int j;
            for (j = 0; j < lengthOfPattern; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == lengthOfPattern) return i;
        }
        return lengthOfText; // 9
    }
}
// 코드 작성시 부딪힌 사항: 2번째 출력문에서 원하는 값인 5가 아닌 9(텍스트길이)가 나왔다.
// 해결법: for문 조건식에 lengthOfText - lengthOfPattern에 1일 더했다.
// 해결된 이유:
// 텍스트길이-패턴길이 하면 패턴이 마지막에 있을 때,
// < 에 걸려서 바로 리턴 텍스트길이로 넘어간다. (이 경우 i = 5일 때 패턴을 찾았는데 원래대로면 i = 4까지만 for문 돌고 5가 되면 바로 텍스트 길이 반환.)
// 따라서 작거나 같다는 부등호로 바꾸거나 지금처럼 1을 더해서 조건을 늘려줘야 한다.
