package Main.Java.DataStructureandAlgorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] test = new int[]{4, 2, 3, 1};
        System.out.println(Arrays.toString(insertionSort(test))); //[1, 2, 3, 4]
    }
    public static int[] insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
}
