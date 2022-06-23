package Main.Java.DataStructureandAlgorithm;

public class CompressString {
    public static void main(String[] args) {

        System.out.println(compressString("hhhellllloo")); // 3he5loo
        System.out.println(compressString("wwwwwwwwwwworld")); // 11world
    }
    private static String compressString(String str) {
        // 빈 문자열인 경우
        if(str.length()==0) return "";

        // 답안 생성
        String ans = "";
        char prev = str.charAt(0);
        int count = 1;

        // 카운트
        str = str + ' ';
        for(int i = 1; i < str.length(); i++) {
            if(prev == str.charAt(i)) {
                count++;
            } else {
                if (count >= 3) {
                    ans = ans + count + prev;
                } else {
                    for(int j = 0; j < count; j++) {
                        ans = ans + prev;
                    }
                } count = 1;
                prev = str.charAt(i);
            }
        }
        return ans;
    }
}


