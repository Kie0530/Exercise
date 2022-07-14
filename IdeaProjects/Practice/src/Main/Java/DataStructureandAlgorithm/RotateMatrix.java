package Main.Java.DataStructureandAlgorithm;


import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] test = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.deepToString(rotateMatrix(test)));
        //[[13, 9, 5, 1], [14, 10, 6, 2], [15, 11, 7, 3], [16, 12, 8, 4]]
    }
    private static int[][] rotateMatrix(int[][] matrix) {
        // 빈 배열인 경우
        if(matrix==null || matrix.length == 0) return null;

        // 90도 회전
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans= new int[n][m];


        for(int r = 0; r < ans.length; r++) {
            for(int c = 0; c < ans[0].length; c++) {
                ans[c][m-1-r] = matrix[r][c];
                }
        } return ans;
    }
}