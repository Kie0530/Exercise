package Main.Java.DataStructureandAlgorithm;
import java.util.Arrays;

public class isIsogram {
    public static void main(String[] args) {
        System.out.println(checkIsogram("aba")); // false
        System.out.println(checkIsogram("abcdef")); // true
    }

    public static boolean checkIsogram(String string) {

        String test = string.toLowerCase();
        char[] arr = test.toCharArray();

        if(arr.length==0) return true;

        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]) return false;
        } return true;
    }
}
