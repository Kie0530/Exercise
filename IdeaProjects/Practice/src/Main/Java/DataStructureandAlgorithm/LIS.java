package Main.Java.DataStructureandAlgorithm;

public class LIS {
    public static int solution(int[] arr) {
        int[] arr2 = new int[arr.length];
        int max = 1;
        for(int i=0; i < arr.length; i++) {
            arr2[i]=1;
            for(int j=0; j < i; j++) {
                if(arr[i] > arr[j]) {
                    arr2[i] = Math.max(arr2[i], arr2[j]+1);
                }
            } max = Math.max(max, arr2[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 4, 5};
        System.out.println(solution(test)); // 5

        int[] test2 = new int[]{3, 5, 1, 2, 9};
        System.out.println(solution(test2)); // 3

    }
}
