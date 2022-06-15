package Main.Java.DataStructureandAlgorithm;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumHM {
    public static void main(String[] args) {

        int[] test = new int[]{1,2,3,4};
        int targetTest = 5;
        System.out.println(Arrays.toString(twoSum(test, targetTest))); // [1, 2]

        int[] test2 = new int[]{5,5,5,6};
        int targetTest2 = 11;
        System.out.println(Arrays.toString(twoSum(test2, targetTest2))); // [2, 3]
    }
    public static int[] twoSum(int[] nums, int target) {

        int[] answer = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                answer[0] = map.get(target - nums[i]);
                answer[1] = i;
                return answer;
            }
            map.put(nums[i],i);
        }
        return null;
    }
}

