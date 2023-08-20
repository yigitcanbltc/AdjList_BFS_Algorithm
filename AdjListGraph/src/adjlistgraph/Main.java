/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adjlistgraph;

/**
 *
 * @author yigit
 */
public class Main {
    
    public static void main(String[] args){
     Graph g = new Graph(15);
 
     g.addEdge(0, 1);
     g.addEdge(0, 2);
     g.addEdge(0, 3);
     g.addEdge(1, 5);
     g.addEdge(1, 4);
     g.addEdge(1, 13);
     g.addEdge(2, 5);
     g.addEdge(2, 6);
     g.addEdge(2, 10);
     g.addEdge(3, 4);
     g.addEdge(3, 7);
     g.addEdge(4, 8);
     g.addEdge(4, 14);
     g.addEdge(5, 11);
     g.addEdge(5, 12);
     g.addEdge(6, 7);
     g.addEdge(6, 9);
     g.addEdge(7, 8);
     g.addEdge(9, 10);
     g.addEdge(10, 11);
     g.addEdge(12, 13);
     g.addEdge(13, 14);
     
    g.BFS(0); 
    g.printGraph();
    
    }
}
