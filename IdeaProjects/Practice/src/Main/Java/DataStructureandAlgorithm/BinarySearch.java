package Main.Java.DataStructureandAlgorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 4, 5, 6};
        int target = 5;
        System.out.println(binarySearch(test, target)); // 4

        int[] test2 = new int[]{15, 20, 25, 30, 35, 40};
        int target2 = 20;
        System.out.println(binarySearch(test2, target2)); // 1
    }
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length -1;
        while(low<=high) {
            int mid = (low + high) / 2;
            if(arr[mid] > target) {
                high = mid -1;
            }
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid] < target) {
                low = mid + 1;
            }
        } return -1;
    }
}
