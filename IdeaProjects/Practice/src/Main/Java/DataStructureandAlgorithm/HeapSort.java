package Main.Java.DataStructureandAlgorithm;
import java.util.*;

public class HeapSort {
    public static void main(String[] args) {
        int[] test = new int[]{5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(heapSort(test))); // [1, 2, 3, 4, 5]
        int[] test2 = new int[]{100, 55, -10, -100};
        System.out.println(Arrays.toString(heapSort(test2))); // [-100, -10, 55, 100]
    }
    public static int[] heapSort(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int num : arr) {
            heap.add(num);
        }
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            res[i] = heap.poll();
        }
        return res;
    }
}
