package Main.Java.DataStructureandAlgorithm;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon1260 {
    static int map[][];
    static boolean[] visit;
    static int N, M, V;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s, " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        map = new int[N+1][N+1];
        visit = new boolean[N+1];
        for(int i=0; i <= N; i++) {
            Arrays.fill(map[i],0);
        }
        Arrays.fill(visit, false);

        for(int i=0; i < M; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            map[a][b] = map[b][a] = 1;
        }
        sb = new StringBuilder();
        dfs(V);
        visit = new boolean[N + 1];
        sb.append("\n");
        bfs(V);
        System.out.println(sb);
    }
    public static void dfs(int ind) {
        visit[ind] = true;
        sb.append(ind + " ");
        for(int i=1; i<=N; i++) {
            if(!visit[i] && map[ind][i]==1) {
                dfs(i);
            }
        }
    }
    public static void bfs(int ind) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(ind);
        visit[ind] = true;
        while(!q.isEmpty()) {
            int temp = q.poll();
            sb.append(temp + " ");
            for(int i=1; i<=N; i++) {
                if(!visit[i] && map[temp][i]==1) {
                    q.add(i);
                    visit[i] = true;

                }
            }
        }
    }
}
