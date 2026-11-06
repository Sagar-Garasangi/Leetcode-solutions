import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {

        Queue<int[]> q = new ArrayDeque<>();

        int rows = grid.length;
        int cols = grid[0].length;

        int fresh = 0;
        int minutes = 0;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 1) {
                    fresh++;
                } 
                else if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
            }
        }

       
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty() && fresh > 0) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                int[] cell = q.poll();

                int r = cell[0];
                int c = cell[1];

                for (int d = 0; d < 4; d++) {

                    int nr = r + dr[d];
                    int nc = c + dc[d];

             
                    if (nr >= 0 && nr < rows &&
                        nc >= 0 && nc < cols) {

                        if (grid[nr][nc] == 1) {

                            grid[nr][nc] = 2;
                            fresh--;

                            q.offer(new int[]{nr, nc});
                        }
                    }
                }
            }

            minutes++;
        }

      
        return fresh == 0 ? minutes : -1;
    }
}
