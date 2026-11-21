class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int oldColor = image[sr][sc];

        if (oldColor == color) {
            return image;
        }

        boolean[][] visited = new boolean[m][n];
        Deque<int[]> stack = new ArrayDeque<>();
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        visited[sr][sc] = true;
        image[sr][sc] = color;
        stack.push(new int[]{sr, sc});

        while (!stack.isEmpty()) {
            int[] curr = stack.pop();
            int r = curr[0];
            int c = curr[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nr < m && nc >= 0 && nc < n) {
                    if (!visited[nr][nc] && image[nr][nc] == oldColor) {
                        visited[nr][nc] = true;
                        image[nr][nc] = color;
                        stack.push(new int[]{nr, nc});
                    }
                }
            }
        }

        return image;
    }
}
