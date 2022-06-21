package Main.Java.DataStructureandAlgorithm;

public class decryptCaesarCipher {
    public static void main(String[] args) {
        System.out.println(decryptCaesarCipher("nqxg", 2)); // love
        System.out.println(decryptCaesarCipher("khoor zruog", 3)); // hello world
    }
    private static String decryptCaesarCipher(String str, int secret) {
        if (str.length()==0) return "";

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String res = "";

        for(int i = 0; i < str.length(); i++) {

            int index = alphabet.indexOf(str.charAt(i));

            if(str.charAt(i)==' ') res += str.charAt(i);

            else {
                if(index - secret >= 0) {
                    res += alphabet.charAt(index - secret);
                }
                else {
                    res += alphabet.charAt(index - secret + 26);
                }
            }
        } return res;

    }
}

