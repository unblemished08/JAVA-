import java.util.*;

public class HasPath {

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

    public static boolean hasPath(ArrayList<Edge> graph[],int src,int dest,boolean vis[])
    {
        if(src==dest)
            return true;

        vis[src]=true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);

            if (!vis[e.dest] && hasPath(graph,e.dest,dest,vis)) {
                return true;
            }
        }

        return false;
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

    boolean vis[] = new boolean[graph.length];
    System.out.println(hasPath(graph,0,4,vis));
  }
}
