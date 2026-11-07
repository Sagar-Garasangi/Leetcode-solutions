class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q=new ArrayDeque<>();

        int[][] dist=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                    dist[i][j]=0;
                }else{
                    dist[i][j]=-1;

                }
            }
        }
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        

        
        
            while(!q.isEmpty()){
                 int[] cell=q.poll();
                 int r=cell[0];
                 int c=cell[1];
                 for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c+ dc[d];
                if(nr>=0 && nr<mat.length && nc>=0 && nc<mat[0].length){

            if(dist[nr][nc]==-1){
                dist[nr][nc]=dist[r][c]+1;
                q.offer(new int[]{nr,nc});
                
            }

            }
           
            }
        
        }

    
        
    return dist;}
}
