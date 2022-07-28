package Main.Java.DataStructureandAlgorithm;

public class SpiralTraversal {
    public static void main(String[] args) {
        Character[][] test = new Character[][]{
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
        };
        System.out.println(spiralTraversal(test)); // ABCFIHGDE
    }
    public static String spiralTraversal(Character[][] matrix) {
        String res = "";
        int colBegin = 0;
        int rowBegin = 0;
        int rowEnd = matrix.length -1;
        int colEnd = matrix[0].length -1;

        while(rowBegin<=rowEnd && colBegin<=colEnd) {
            // 오른쪽으로
            for(int j = colBegin; j <= colEnd; j++) {
                res += matrix[rowBegin][j];
            } rowBegin++;
            // 밑으로
            for(int j = rowBegin; j <= rowEnd; j++) {
                res += matrix[j][colEnd];
            } colEnd--;
            // 왼쪽으로
            if(rowBegin<=rowEnd) {
                for(int j = colEnd; j >= colBegin; j--) {
                    res += matrix[rowEnd][j];
                }
            } rowEnd--;
            // 위로
            if(colBegin<=colEnd) {
                for(int j = rowEnd; j >= rowBegin; j--) {
                    res += matrix[j][colBegin];
                }
            } colBegin++;
        } return res;
    }
}
