package Main.Java.DataStructureandAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] test = new int[]{5,4,3,2,1};
        System.out.println(Arrays.toString(bubbleSort(test))); //[1, 2, 3, 4, 5]
        int[] test2 = new int[]{5,9,2,4,2,0};
        System.out.println(Arrays.toString(bubbleSort(test2))); //[0, 2, 2, 4, 5, 9]
    }
    private static int[] bubbleSort(int[] arr) {

        for(int i=1; i < arr.length; i++) {
            for(int j=0; j < arr.length-i; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
