package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.Iterator;
import java.util.LinkedList;

public class N123_너비우선탐색 {
    public static void main(String[] args) {
        //너비우선탐색(BFS)은 그래프나 트리의 모든 노드를 순회(방문)하는 대표적인 알고리즘.
        //1. 큐를 생성한다
        //2. v에 방문했다고 표시하고 Q에 v를 넣는다
        //3. Q가 빌 때까지
        //4. Q의 헤드 h를 삭제한다
        //5. h의 모든 (방문하지 않은) 이웃에 방문했다고 표시하고 큐에 넣는다
        Graph graph = new Graph(4);
        graph.addEdge(0, 3);
        graph.addEdge(0, 1);
        graph.addEdge(1, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        graph.addEdge(3, 2);
        graph.addEdge(3, 3);
        graph.BFS(0); //0 3 1 2
    }

    public static class Graph {
        private final int v;
        private final LinkedList<Integer>[] adjacents;

        public Graph(int v) {
            this.v = v;
            adjacents = new LinkedList[v];
            for (int i = 0; i < v; ++i){
                adjacents[i] = new LinkedList<>();
            }
        }

        public void addEdge(int v, int e) {
            adjacents[v].add(e);
        }

        public void BFS(int start) {
            boolean visited[] = new boolean[v];
            LinkedList<Integer> queue = new LinkedList<>();
            visited[start] = true;

            queue.add(start);

            while (!queue.isEmpty()){
                start = queue.poll();
                System.out.print(start + " ");

                Iterator<Integer> i = adjacents[start].listIterator();
                while (i.hasNext()){
                    int n = i.next();
                    if (!visited[n]){
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
    }
}
