package Main.Java.DataStructureandAlgorithm;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProgrammersHashLevel2 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String p : phone_book) {
            map.put(p, 0);
        }
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j)))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] test = new String[]{"119", "97674223", "1195524421"};
        System.out.println(solution(test)); //false

        String[] test2 = new String[]{"119", "1234", "93724"};
        System.out.println(solution(test2)); //true
    }
}
