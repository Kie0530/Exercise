package Main.Java.DataStructureandAlgorithm;

import java.util.Arrays;

public class ReverseRangeRecursion {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverseRange(test, 2,4)));
        // [1, 2, 5, 4, 3, 6, 7]

        int[] test2 = new int[]{100, 75, 50, 25, 0};
        System.out.println(Arrays.toString(reverseRange(test2, 0,4)));
        // [0, 25, 50, 75, 100]

    }
    public static int[] reverseRange(int[] arr, int low, int high) {
        if(low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            reverseRange(arr, low+1, high-1);
        } return arr;
    }
}
