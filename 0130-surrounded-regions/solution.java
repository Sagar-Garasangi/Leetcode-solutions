import java.util.*;

class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        boolean[][] visited = new boolean[rows][cols];

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        Stack<int[]> s = new Stack<>();

   
        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O' && !visited[0][j]) {
                s.push(new int[]{0, j});
                visited[0][j] = true;
            }

            if (board[rows - 1][j] == 'O' && !visited[rows - 1][j]) {
                s.push(new int[]{rows - 1, j});
                visited[rows - 1][j] = true;
            }
        }

   
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O' && !visited[i][0]) {
                s.push(new int[]{i, 0});
                visited[i][0] = true;
            }

            if (board[i][cols - 1] == 'O' && !visited[i][cols - 1]) {
                s.push(new int[]{i, cols - 1});
                visited[i][cols - 1] = true;
            }
        }

   
        while (!s.isEmpty()) {
            int[] cell = s.pop();

            int r = cell[0];
            int c = cell[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nr < rows &&
                    nc >= 0 && nc < cols &&
                    board[nr][nc] == 'O' &&
                    !visited[nr][nc]) {

                    visited[nr][nc] = true;
                    s.push(new int[]{nr, nc});
                }
            }
        }

 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O' && !visited[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
