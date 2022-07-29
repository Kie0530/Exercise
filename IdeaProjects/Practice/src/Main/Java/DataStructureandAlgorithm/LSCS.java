package Main.Java.DataStructureandAlgorithm;

public class LSCS {
    public static void main(String[] args) {
        int[] test = new int[]{10, -11, 11};
        System.out.println(lscs(test)); // 11

        int[] test2 = new int[]{3, 2, 10, -14, -10, 0, -9, 10};
        System.out.println(lscs(test2)); //15

    }
    public static int lscs(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int num : arr) {
            sum += num;
            if(sum > max) max = sum;
            if(sum < 0) sum = 0;
        }
        return max;
    }
}
