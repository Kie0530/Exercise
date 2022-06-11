package Main.Java.DataStructureandAlgorithm;
import java.util.*;

public class VirusBFS {
    static int[] visited;
    static int[][] node;
    static void BFS(int first){
        Queue<Integer> queue = new LinkedList<>();
        visited[first]=1;
        queue.offer(first);

        int virus = 0;

        while(!queue.isEmpty()) {
            int p = queue.poll();

            for(int i = 1; i < node.length; i++) {
                if(node[p][i]==1 && visited[i]!=1){
                    virus++;
                    visited[i]=1;
                    queue.offer(i);
                }
            }
        }
        System.out.println(virus);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int total = s.nextInt();
        int connected = s.nextInt();

        node = new int[total+1][total+1];
        visited = new int[total+1];

        for(int i = 0; i < connected; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            node[a][b] = 1;
            node[b][a] = 1;
        }

        BFS(1);
    }
}
