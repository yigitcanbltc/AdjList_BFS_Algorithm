/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adjlistgraph;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author yigit
 */
public class Graph {
    public int V;
    public int E;
    public LinkedList<Integer>[] adj;
    public int[] distance;
    public int[] color;
    public int[] parent;
    public Queue<Integer> queue;

    
    
    public Graph(int node){
        this.V=node;
        this.E=0;
        this.adj = new LinkedList[node];
        for(int i=0;i<V;i++){
            adj[i] = new LinkedList<>();
        }
        this.color = new int[node]; // Ekleme
        this.distance = new int[node]; // Ekleme
        this.parent = new int[node]; // Ekleme
        this.queue = new LinkedList<>();
    }
    
    public void addEdge(int str,int dst){
        adj[str].add(dst);
        adj[dst].add(str);
        E++;
    }
    
    public void printGraph(){
        System.out.print(V + "Dugum"+", "+E+"Kenar\n");
        for(int i=0;i<V;i++){
            System.out.print(i+":");
            for(int j : adj[i]){
               System.out.print(j+" ");
            }
            System.out.print("\nAdim Sayisi:"+distance[i]);
            System.out.println();
        }
    }
    
    public void BFS(int s){//S kaynak düğümü ifade eder.
      
        for(int i=0;i<V;i++){
            if(i==s){
                 i++;
            }
            color[i]=0;
            distance[i]=9999;
            parent[i]=-1;
        }
        color[s]=1;
        distance[s]=0;
        parent[s]=-1;
        queue.add(s);
        
        while(!queue.isEmpty()){
            int u = queue.poll();
            for(int v : adj[u]){
                if(color[v]==0){
                    color[v]=1;
                    distance[v]=distance[u]+1;
                    parent[v]=u;
                    queue.add(v);
                }
            }
            color[u]=2;
        }
    }   
}
