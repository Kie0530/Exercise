package Main.Java.DataStructureandAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


    public class LetterCombinationsPhoneNum  {
        public static void main(String[] args)  throws Exception {

            System.out.println(letterCombinations("23"));
            //[ad, ae, af, bd, be, bf, cd, ce, cf]
            System.out.println(letterCombinations("9"));
            //[w, x, y, z]
            System.out.println(letterCombinations(""));
            //[]
            System.out.println(letterCombinations("50"));
            //[[j , k , l ]]
            System.out.println(letterCombinations("11"));
            //[  ]


        }
        public static List<String> letterCombinations(String digits) {
            LinkedList<String> answer = new LinkedList<>();
            answer.add(""); // 널포인터익셉션 해결

            // digits가 빈 경우
            if(digits.length()==0) return answer;

            // 키패드 번호가 알파벳 있는 인덱스와 일치하게 키패드 알파벳 배열 생성
            String[] num = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

            // 반복문으로 answer 채우기
            // 주어지는 digits의 두 수를 for문이 확인할 것
            for(int i = 0; i < digits.length(); i++) {
                // 인덱스 만들어주기
                int j = digits.charAt(i) -'0';

                // 아래 while문 안에 add 메서드를 넣자 널포인터익셉션 에러가 났다. (위로 옮겨서 해결)
                while(answer.peek().length()==i) {
                    String s = answer.remove();
                    for(char c : num[j].toCharArray())
                        answer.add(s+c);
                }
            } return answer;

        }
    }



