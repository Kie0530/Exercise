package Main.Java.DataStructureandAlgorithm;

public class numberSearch {
    public static void main(String[] args) {
        System.out.println(numberSearch("Hello6 ")); // 1
        System.out.println(numberSearch("Alg0rit53 !;1")); // 1
        System.out.println(numberSearch("abcdefg66")); // 2
        System.out.println(numberSearch("")); // 0
    }
    private static int numberSearch(String str) {
        // TODO:
        // 빈 문자열인 경우
        if(str.length()==0) return 0;

        // str에서 공백없애기
        String string = str.replaceAll(" ", "");

        // boolean으로 숫자인지 문자인지 체크해서 숫자면 sum이라는 정수에 더해주고
        // 문자면 count라는 정수를 1씩 올려주고
        // 나눈 값을 반올림해서 리턴
        double sum = 0;
        int count = 0;

        for(int i = 0; i < string.length(); i++) {
            boolean isNum = Character.isDigit(string.charAt(i));

            if(isNum) {
                sum += string.charAt(i)-'0';
            }
            else {
                count++;
            }

        }
        double result = sum / count;
        return (int) Math.round((result * 100) / 100);
    }
}
