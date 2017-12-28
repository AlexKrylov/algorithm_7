public class Main {
    static int vertexCount;
    static int edgeCount;
    static boolean[][] matrixAdjacency;
    static boolean[] used;

    public static void main(String[] args) {

    }
    
    //Поиск в глубину (Depth-first search, DFS)
    public static void dfs(int v) {
        used[v] = true;
        for (int i = 0; i < vertexCount; i++)
            if (!used[i] && matrixAdjacency[v][i])
                dfs(i);
    }

    //Поиск в ширину (Breadth-first search, BFS)
    public static void bfs(int v) {
        boolean[] used = new boolean[vertexCount];
        int[] queue = new int[vertexCount];
        int first = 0;
        int last = 0;
        used[v] = true;
        queue[last++] = v;
        while (first < last) {
            v = queue[first++];
            for (int i = 0; i < vertexCount; i++) {
                if (!used[i] && matrixAdjacency[v][i]) {
                    used[i] = true;
                    queue[last++] = i;
                }
            }
        }
    }
}
