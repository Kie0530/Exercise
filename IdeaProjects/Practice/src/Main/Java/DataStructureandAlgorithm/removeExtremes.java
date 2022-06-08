package Main.Java.DataStructureandAlgorithm;
import java.util.*;

public class removeExtremes {
    public static void main(String[] args) {
        String[] test = new String[]{"remove", "the", "last", "shortest", "longest", "words", "!!!"};
        System.out.println(Arrays.toString(removeExtremes(test)));
        // 출력: [remove, the, last, longest, words]
    }
    public static String[] removeExtremes(String[] arr) {
        // 빈 배열일 경우
        if(arr.length == 0) return null;

        // 리스트 선언
        List<String> result = new ArrayList<String>(Arrays.asList(arr));

        // 가장 긴 문자열 찾기
        String max = "";
        for(String string : result) {
            if(string.length() > max.length()) {
                max = string;
            }
        }
        // 가장 긴 문자열로 크기 잡기
        String min = max;
        // 가장 짧은 문자열 찾기
        for(String string : result) {
            if(string.length() <= min.length()) {
                min = string;
            }
        }
        // 제거
        result.remove(min);
        result.remove(max);
        // 리스트 -> 배열
        String[] realResult = result.stream().toArray(String[]::new);
        // 결과 반환
        return realResult;

    }
}
