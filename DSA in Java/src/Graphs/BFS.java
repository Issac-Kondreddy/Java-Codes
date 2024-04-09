package Graphs;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        graph Graph = new graph(4);
        Graph.addEdge(0, 1);
        Graph.addEdge(0, 2);
        Graph.addEdge(1, 2);
        Graph.addEdge(2, 0);
        Graph.BFS(0);
    }
}

class graph{

    int vertices;
    LinkedList<Integer>[] adjacency_list;
    @SuppressWarnings("unchecked") graph(int vertices){
        this.vertices = vertices;
        adjacency_list = new LinkedList[vertices];
        for(int i=0;i<vertices;i++){
            adjacency_list[i] = new LinkedList<>();
        }
    }
    void addEdge(int startnode, int endnode){
        adjacency_list[startnode].add(endnode);
    }

    void BFS(int startnode){
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startnode);
        visited[startnode] = true;
        while(!queue.isEmpty()){
            int current_node = queue.poll();
            System.out.println("Current Node: " + current_node);
            for (int neighbor : adjacency_list[current_node])
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
        }
    }
}
