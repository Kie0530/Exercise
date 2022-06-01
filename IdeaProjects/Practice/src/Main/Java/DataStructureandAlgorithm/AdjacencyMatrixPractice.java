package Main.Java.DataStructureandAlgorithm;



class AdjacencyMatrixPractice {
    public static int[][] makeMatrix(int[][] edges) {
        int num = 0;
        // 반환할 배열 크기 구하기
        for(int i = 0; i <edges.length; i++) {
            for(int j = 0; j < edges[i].length; j++) {
                if(num < edges[i][j]) num = edges[i][j];
            }
        }
        // 반환할 배열 생성
        int[][] result = new int[num + 1][num + 1];

        for(int i = 0; i < edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            result[from][to] = 1;

            if(edges[i][2] == 1) result[to][from] = 1;
        }
        return result;
    }
}

