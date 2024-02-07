package s1_2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static int[][] A;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        visited = new boolean[N][M]; //0,1로 배열을 받기 때문에 boolean 타입 배열로 받음

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            String line = st.nextToken();
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(line.substring(i, j + 1));

            }
        }
        BFS(0, 0);
        System.out.println(A[N - 1][M - 1]); //인덱스 0부터 시작이라 그럼
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();   // 큐 만들기
        queue.offer(new int[]{i, j});

        while (!queue.isEmpty()) {   // 큐가 다 비어질때까지 반복해야 함
            int now[] = queue.poll();  //now[]로 큐에 있는 값 가져오기
            visited[i][j] = true;
            for (int k = 0; k < 4; k++) { //k가 4인 이유는 방항이 4개이기 때문에
                int x = now[0] + dx[k]; // 가져온 값을 기준으로 k 의 방향대로 욺직임(?)
                int y = now[1] + dy[k];
                if (x >= 0 && y >= 0 && x < N && y < M) {  //범위를 지정해줘야 입력한 N,M의 범위를 벗어나지 않음
                    if (A[x][y] != 0 && visited[x][y]) {
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1; //노드의 깊이를 봐야해서 +1 을 해서 깊게 탐색한다
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}
