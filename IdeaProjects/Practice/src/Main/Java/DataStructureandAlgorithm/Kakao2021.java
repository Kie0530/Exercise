package Main.Java.DataStructureandAlgorithm;

import java.util.*;

public class Kakao2021 {
    public static void main(String[] args) {
        String test = "one23fourfive";
        System.out.println(solution(test)); //12345
    }

        private static int solution(String s) {
            int answer = 0;
            String res = "";
            String[] num = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            List<String> list = Arrays.asList(num);
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < s.length(); i++) {
                boolean isNum = Character.isDigit(s.charAt(i));
                if(isNum) {
                    res += s.charAt(i);
                } else {
                    sb.append(s.charAt(i));
                    if(list.contains(sb.toString())) {
                        res += list.indexOf(sb.toString());
                        sb.setLength(0);
                    }
                }
            }
            answer = Integer.parseInt(res);
            return answer;
        }
    }



