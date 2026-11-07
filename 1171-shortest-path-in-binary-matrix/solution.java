class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int[][] dist=new int[grid.length][grid[0].length];
        Queue<int[]>q=new ArrayDeque<>();
        if (grid[0][0] == 1 || grid[grid.length-1][grid[0].length-1] == 1) {
        return -1;
        }
        dist[0][0] = 1;
        q.offer(new int[]{0, 0});

        int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dc = {0, 0, -1, 1, -1, 1, -1, 1};

        while(!q.isEmpty()){
            int cell[]=q.poll();
            int r=cell[0];
            int c=cell[1];
            for(int d=0;d<8;d++){
                int nr=r+dr[d];
                int nc=c+dc[d];
            if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length){
                if(grid[nr][nc]==0 && dist[nr][nc]==0){
                    dist[nr][nc]=dist[r][c]+1;
                    if (nr == grid.length - 1 && nc == grid[0].length - 1) {
    return dist[nr][nc];
}
                    q.offer(new int []{nr,nc} );
                }

            }
            }
        }
        return dist[grid.length-1][grid[0].length-1] == 0 ? -1 : dist[grid.length-1][grid[0].length-1];

        
    }
}
