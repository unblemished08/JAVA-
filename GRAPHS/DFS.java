import java.util.*;

public class DFS {

  static class Edge {

    int src;
    int dest;
    int wt;

    public Edge(int src, int dest, int wt) {
      this.src = src;
      this.dest = dest;
      this.wt = wt;
    }
  }

    public static void dfs(ArrayList<Edge> graph[])
    {
        boolean vis[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++) {
            if(!vis[i])
            {
                dfsUtil(graph,i,vis);
            }
        }
    }


  public static void dfsUtil(ArrayList<Edge> graph[],int curr,boolean vis[]) {
    //visit
    System.out.print(curr+" ");
    vis[curr] = true;

    for (int i = 0; i < graph[curr].size(); i++) {
        Edge e = graph[curr].get(i);

        if (!vis[e.dest]) {
            dfsUtil(graph,e.dest,vis);
        }
    }
}

  public static void main(String[] args) {
    int v = 5;
    @SuppressWarnings("unchecked")
    ArrayList<Edge> graph[] = new ArrayList[v];

    for (int i = 0; i < v; i++) {
      graph[i] = new ArrayList<>();
    }

    //0 vertex
    graph[0].add(new Edge(0, 1, 5));

    //1 vertex
    graph[1].add(new Edge(1, 0, 5));
    graph[1].add(new Edge(1, 2, 1));
    graph[1].add(new Edge(1, 3, 3));

    //2 vertex
    graph[2].add(new Edge(2, 1, 1));
    graph[2].add(new Edge(2, 3, 1));
    graph[2].add(new Edge(2, 4, 4));

    //3 vertex
    graph[3].add(new Edge(3, 1, 3));
    graph[3].add(new Edge(3, 2, 1));

    //4 vertex
    graph[4].add(new Edge(4, 2, 2));

    dfs(graph);
  }
}
