class Solution {
    public int maxDistance(int[][] grid) {
        Queue <int []> q=new ArrayDeque<>();
        int n=grid.length;
        int m=grid[0].length;
        int c1=0;
        int c0=0;
        int maxd=0;
        int [][] dist=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    q.offer(new int[]{i,j});
                    dist[i][j]=0;
                    c1++;
                }else{
                    dist[i][j]=-1;
                    c0++;
                }

            }
        }
        if(c1==n*m || c0==n*m){
            return -1;
        }
        int [] dr={-1,1,0,0};
        int [] dc={0,0,1,-1};
        while(!q.isEmpty()){
            int []cell=q.poll();
            int r=cell[0];
            int c=cell[1];
            for(int d=0;d<4;d++){
                int nr=r+dr[d];
                int nc=c+dc[d];
                if(nr>=0 && nr<n && nc>=0 && nc<m){
                    if(grid[nr][nc]==0){
                        dist[nr][nc]=dist[r][c]+1;
                        grid[nr][nc]=-1;
                        q.offer(new int[]{nr,nc});
                        maxd=Math.max(maxd,dist[nr][nc]);

                    }
                }
            }
        }
        return maxd;
        
    }
}
