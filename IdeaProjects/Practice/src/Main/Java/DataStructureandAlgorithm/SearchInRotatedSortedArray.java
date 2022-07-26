package Main.Java.DataStructureandAlgorithm;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] test = new int[]{4, 5, 0, 1, 2, 3};
        int target = 1;
        System.out.println(search(test, target)); // 3

        int[] test2 = new int[]{12, 13, 14, 15, 16, 17, 18, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int target2 = 7;
        System.out.println(search(test2, target2)); // 14
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
    public static int binarySearch(int[] nums, int start, int end, int target) {
        if(start >= end) {
            return (nums[start] == target) ? start : -1;
        }
        int temp = -1;
        int mid = (start + end) / 2;
        if(nums[mid]==target){
            temp = mid;
        } else {
            temp = binarySearch(nums, start, mid-1, target);
            if(temp < 0) {
                temp = binarySearch(nums,  mid+1, end, target);
            }
        } return temp;
    }
}
