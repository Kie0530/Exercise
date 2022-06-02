package Main.Java.JavaExercise;
import java.util.*;

public class makePhoneNumberPractice {
    public static void main(String[] args) {
        int[] test = new int[]{0,1,0,1,2,3,4,5,6,7,8};
        int[] test2 = new int[]{1,2,3,4,5,6,7,8};
        System.out.println(phoneNum(test)); // (010)1234-5678
        System.out.println(phoneNum(test2)); // (010)1234-5678
    }

    public static String phoneNum(int[] arr) {
        String head = "010";
        int length = arr.length;

        String body = Arrays.toString(Arrays.copyOfRange(arr, length-8, length-4));
        String bod = body
                .replaceAll(" ","")
                .replaceAll(",","")
                .replace("[","")
                .replace("]","");
        String tail = Arrays.toString(Arrays.copyOfRange(arr, length-4, length));
        String tai = tail
                .replaceAll(" ","")
                .replaceAll(",","")
                .replace("[","")
                .replace("]","");
        if(length == 11) {
            String headd = Arrays.toString(Arrays.copyOfRange(arr,0,3));
            head = headd
                    .replaceAll(" ","")
                    .replaceAll(",","")
                    .replace("[","")
                    .replace("]","");
        }
        return String.format("(%s)%s-%s", head, bod, tai);
    }
}

