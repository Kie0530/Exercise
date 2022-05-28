package Main.Java;
import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("빨", 1);
        map.put("주", 2);
        map.put("노", 3);
        map.put("초", 4);
        map.put("파", 5);
        map.put("남", 6);
        map.put("보", 7);

        System.out.println("총 entry 수 : " + map.size());

        System.out.println("빨 : " + map.get("빨"));

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }

        map.remove("보");
        System.out.println("---");

        System.out.println("총 entry 수 : " + map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : "+ value);
        }
        // 출력:
        // ---
        //총 entry 수 : 6
        //빨 : 1
        //노 : 3
        //초 : 4
        //남 : 6
        //주 : 2
        //파 : 5
    }
}
// 출력:
//총 entry 수 : 7
//빨 : 1
//보 : 7
//빨 : 1
//노 : 3
//초 : 4
//남 : 6
//주 : 2
//파 : 5