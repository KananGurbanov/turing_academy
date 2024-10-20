package az.edu.turing.module1.lesson6.DataStructures.graph;

public class Graph {
    int [][] matrix;
    public Graph(int V) {
        matrix = new int[V][V];
    }

    public void addEdge(int v, int w) {
        matrix[v][w] = 1;
        matrix[w][v] = 1;
    }

    public void toAdjMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void dfs(int src) {
        boolean [] visited = new boolean[matrix.length];
        dfsHelper(src, visited);
    }

    private void dfsHelper(int vertex, boolean [] visited) {
        if(visited[vertex]) {
            return;
        }
        else visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int k = 0; k < matrix[vertex].length; k++) {
            if (matrix[vertex][k] == 1)     {
                dfsHelper(k, visited);
            }
        }
    }
}
