import java.util.*;

public class TopologicalSortingDFS {

    static class Edge {

        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void topSort(ArrayList<Edge> graph[])
    {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s=new Stack<>();

        for(int i = 0; i < graph.length; i++) {
            if(!vis[i])
            {
                topSortUtil(graph,i,vis,s);
            }
        }

        while(!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }
    }


    public static void topSortUtil(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> s) {
        
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                topSortUtil(graph,e.dest,vis,s);
            }
        }

        s.push(curr);
    }

    public static void main(String[] args) {
        int v = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        //0 vertex
        //graph[0].add(new Edge(0, 1, 5));

        //1 vertex
        //graph[1].add(new Edge(1, 0, 5));
        //graph[1].add(new Edge(1, 2, 1));
        //graph[1].add(new Edge(1, 3, 3));

        //2 vertex
        //graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3));
        //graph[2].add(new Edge(2, 4, 4));

        //3 vertex
        graph[3].add(new Edge(3, 1));
        //graph[3].add(new Edge(3, 2, 1));

        //4 vertex
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        topSort(graph);
    }
}
