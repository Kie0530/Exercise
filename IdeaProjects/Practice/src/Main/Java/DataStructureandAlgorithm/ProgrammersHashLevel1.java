package Main.Java.DataStructureandAlgorithm;
import java.util.*;
public class ProgrammersHashLevel1 {
    public static String solution(String[] participant, String[] completion) {
        String ans = "";
        Map<String, Integer> map = new HashMap<>();
        for(String p : participant) {
            map.put(p,map.getOrDefault(p, 0) +1);
        }
        for(String c : completion) {
            map.put(c, map.get(c)-1);
        }
        for(String k : map.keySet()) {
            if(map.get(k) != 0) {
                ans = k;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] pTest = new String[]{"kim", "lee", "park"};
        String[] cTest = new String[]{"kim", "park"};
        System.out.println(solution(pTest, cTest)); // lee

        String[] pTest2 = new String[]{"kim", "lee", "park","lee"};
        String[] cTest2 = new String[]{"kim", "park", "lee"};
        System.out.println(solution(pTest2, cTest2)); // lee
    }
}
