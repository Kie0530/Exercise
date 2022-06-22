package Main.Java.DataStructureandAlgorithm;

import java.sql.Array;
import java.util.*;


public class LetterCombinationsPhoneNum  {

        public static void main(String[] args)  throws Exception {

            System.out.println(letterCombinations("23"));
            //[ad, ae, af, bd, be, bf, cd, ce, cf]
            System.out.println(letterCombinations("9"));
            //[w, x, y, z]
            System.out.println(letterCombinations(""));
            //[]
            System.out.println(letterCombinations("50"));
            //[]
            System.out.println(letterCombinations("11"));
            //[]


        }

        public static List<String> letterCombinations(String digits) {
            List<String> ans = new ArrayList<>();
            if(digits.length()==0) return ans;

            backtrack(digits, 0, new StringBuilder(), ans);
            return ans;
        }


        private static void backtrack(String digits, int start, StringBuilder sb, List<String> ans) {
            int len = sb.length();
            if(len == digits.length()) {
                ans.add(sb.toString());
                return;
            }

            for(int i = start; i < digits.length(); i++) {
                String letters = getLetters(digits.charAt(i));

                for(int j = 0; j < letters.length(); j++) {
                    sb.append(letters.charAt(j));
                    backtrack(digits, i + 1,sb, ans);
                    sb.setLength(len);
                }
            }
        }


        private static String getLetters(char c) {
            switch(c) {
                case '2' :
                    return "abc";
                case '3' :
                    return "def";
                case '4' :
                    return "ghi";
                case '5' :
                    return "jkl";
                case '6' :
                    return "mno";
                case '7' :
                    return "pqrs";
                case '8' :
                    return "tuv";
                case '9' :
                    return "wxyz";
            }
            return "";
        }
    }



