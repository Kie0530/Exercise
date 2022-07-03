package Main.Java.DataStructureandAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NextPermutation {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,3};
        System.out.println(Arrays.toString(nextPermutation(test)));//[1, 3, 2]
        int[] test2 = new int[]{1,1,1,2};
        System.out.println(Arrays.toString(nextPermutation(test2)));//[1, 1, 2, 1]
        int[] test3 = new int[]{5,4,5};
        System.out.println(Arrays.toString(nextPermutation(test3)));//[5, 5, 4]
    }

    private static int[] nextPermutation(int[] nums) {
        int i = nums.length-1;
        while(i>0 && nums[i-1]>=nums[i]) {
            i--;
        }
        if(i>0){
            int j = nums.length-1;
            while(nums[j]<=nums[j-1]) {
                j--;
            }
            swap(nums, i-1, j);
        }
        reverse(nums, i);
        return nums;
    }
    private static void reverse(int[] nums, int l) {
        int h = nums.length-1;
        while(h>l) {
            swap(nums, h--, l--);
        }
    }
    private static void swap(int[] nums, int i, int j){
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }

}

