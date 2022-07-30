package Main.Java.DataStructureandAlgorithm;

public class BinarySearch2DMatrix {
    public static void main(String[] args) {
        int[][] test = new int[][]{
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int trueTarget = 16;
        int falseTarget = 21;

        System.out.println(solution(test, trueTarget)); // true
        System.out.println(solution(test, falseTarget)); // false
    }
    public static boolean solution(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col >= 0) {
            if(matrix[row][col]==target) return true;
            if(matrix[row][col] < target) row++;
            else col--;
        } return false;
    }
}
