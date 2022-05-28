package Main.Java;
import java.util.*;

public class GraphPractice {
    private int[][] graph;

    public void setGraph(int size) { // 그래프에 size만큼의 버택스 추가
        graph = new int[size][size];

    //    for(int i = 0; i <size; i+++) {
            for(int j = 0; j <size; j++) {
         //       graph[i][j] = 0;
            }
        }
 //   }
    public int[][] getGraph() { // 인접 행렬 정보가 담긴 배열 반환
        return graph;
    }
    public void addEdge(int from, int to) { // fromVertex와 toVertex 사이 간선 추가
        if(from >= graph.length || to >= graph.length) return;
        graph[from][to] = 1;
    }
    public boolean hasEdge(int from, int to) { //fromVertex와 toVertex 사이 간선 존재 여부 Boolean 반환
        if (from >= graph.length || to >= graph.length) return false;
        else if (graph[from][to] == 1) return true;
        else return false;
    }
    public void removeEdge(int from, int to) { // fromVertex와 toVertex 사이 간선 삭제
        if(from >= graph.length || to >= graph.length) return;
        graph[from][to] = 0;
    }

}
