package Main.Java.JavaExercise;

public class StringBufferStringBuilderExercise {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("apple");
        StringBuffer sb2 = new StringBuffer("apple");

        System.out.println(sb.append("123")); // apple123
        System.out.println(sb.delete(5,8)); // apple
        System.out.println(sb.insert(2, '.')); // ap.ple
        System.out.println(sb.reverse()); // elp.pa
        System.out.println(sb.capacity()); // 21
        System.out.println(sb.length()); // 6

        System.out.println(sb == sb2); // false
        System.out.println(sb.equals(sb2)); // false

        String s = sb.toString();
        String s2 = sb2.toString();

        System.out.println(s.equals(s2)); // true

        System.out.println(sbReverse("apple")); // elppa

    }

    public static String sbReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
