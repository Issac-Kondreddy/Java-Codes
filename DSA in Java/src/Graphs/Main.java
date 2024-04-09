package Graphs;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
    }
}

class Graph {
    int vertices;
    LinkedList[] adjacency_list;
    Graph(int vertices){
        this.vertices = vertices;
        adjacency_list = new LinkedList[vertices];
        for(int i=0;i<vertices;i++){
            adjacency_list[i] = new LinkedList<>();
        }
    }
    void addEdge(int startnode, int endnode){
        adjacency_list[startnode].add(endnode);
    }
}