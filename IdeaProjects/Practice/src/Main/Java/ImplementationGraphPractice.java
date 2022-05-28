package Main.Java;
import java.util.*;



public class ImplementationGraphPractice {
    private ArrayList<ArrayList<Integer>> graph; // 버텍스와 간선을 담을 수 있는 ArrayList<ArrayList<Integer>> 타입의 graph

    public ImplementationGraphPractice() {
        graph = new ArrayList<>();
    }

    // TODO: 정점을 추가합니다.
    // 넘겨받은 size만큼 빈 ArrayList를 값으로 할당합니다.
    public void setGraph(int size){
        for(int i = 0; i < size; i++) {
            graph.add(new ArrayList<Integer>());
        } // ArrayList에 Integer타입의 ArrayList를 자리마다 넣음?
    }

    //그래프를 반환합니다.
    public ArrayList<ArrayList<Integer>> getGraph() {
        return graph;
    }

    // TODO: 간선을 추가합니다. // 왜 int와 int가 아닌 int와 Integer인지...
    public void addEdge(int from, Integer to) { // fromVertex, toVertex 사이의 간선 추가
        //from, to가 그래프의 크기보다 작거나, 음수일 경우 아무것도 추가하지 않습니다.
        if(from < 0 || to < 0 || from >= graph.size() || to >= graph.size()) return;
        //from, to가 정확하게 입력되었을 경우
        // - from의 인접 리스트에 to를 추가하고
        // - to의 인접 리스트에 from를 추가합니다.
        graph.get(from).add(to);
        graph.get(to).add(from);
    }

    public boolean hasEdge(int from, int to) { // fromVertex와 toVertex 사이의 간선이 존재하는지 여부를 Boolean으로 반환
        //from, to가 그래프의 크기보다 작거나, 음수일 경우 아무것도 추가하지 않습니다.
        if(from < 0 || to < 0 || from >= graph.size() || to >= graph.size()) return false;
            //ArrayList에서 제공하는 contains를 사용하여 boolean 타입의 값을 반환합니다.
        else return graph.get(from).contains(to);
    }

    public void removeEdge(int from, int to) { // fromVertex와 toVertex 사이의 간선을 삭제
        //from, to가 그래프의 크기보다 작거나, 음수일 경우 아무것도 제거하지 않습니다.
        if(from < 0 || to < 0 || from >= graph.size() || to >= graph.size()) return;
        //from의 인접 리스트가 to로 이어지는 간선이 존재하는 경우
        if(graph.get(from).contains(to)) {
            //from의 인접 리스트에서 to를 삭제합니다.
            graph.get(from).remove((Integer) to);
        }

        //to의 인접 리스트가 from으로 이어지는 간선이 존재하는 경우
        if(graph.get(to).contains(from)) {
            //to의 인접 리스트에서 from을 삭제합니다.
            graph.get(to).remove((Integer) from);
        }
    }
}
