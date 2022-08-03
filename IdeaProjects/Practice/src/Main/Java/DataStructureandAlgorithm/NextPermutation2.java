package Main.Java.DataStructureandAlgorithm;

import java.util.Arrays;

public class NextPermutation2 {
    public static int[] solution(int[] nums) {
        int i = nums.length -2;

        while(i>=0 && nums[i]>=nums[i+1]) i--;

        if(i>=0) {
            int j = nums.length -1;
            while(nums[j]<=nums[i])j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
        return nums;
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void reverse(int[] nums, int i, int j) {
        while(i<j) swap(nums, i++, j--);
    }


    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(solution(test)));
        //[1, 3, 2]

        int[] test2 = new int[]{1, 0, 1, 5};
        System.out.println(Arrays.toString(solution(test2)));
        //[1, 0, 5, 1]
    }
}
