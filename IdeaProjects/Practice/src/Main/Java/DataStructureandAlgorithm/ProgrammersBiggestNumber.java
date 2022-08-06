package Main.Java.DataStructureandAlgorithm;
import java.util.*;

public class ProgrammersBiggestNumber {
        public static String solution(int[] numbers) {
            String[] nums = new String[numbers.length];
            for(int i=0; i <numbers.length; i++) {
                nums[i] = String.valueOf(numbers[i]);
            }
            Arrays.sort(nums, (o1, o2) -> (o2+o1).compareTo(o1+o2));
            if(nums[0].equals("0")) return "0";
            StringBuilder sb = new StringBuilder();
            for(String s : nums) {
                sb.append(s);
            }
            return sb.toString();
        }

    public static void main(String[] args) {
        int[] test = new int[]{3, 30, 34, 5, 9};
        System.out.println(solution(test)); //9534330

        int[] test2 = new int[]{0, 0, 0, 0, 0};
        System.out.println(solution(test2)); //0
    }
}

