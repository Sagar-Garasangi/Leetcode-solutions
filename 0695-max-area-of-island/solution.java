class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int visited[][]=new int[n][grid[0].length];
        Stack<int []> s=new Stack<>();
        int count=0;
        int max=0;
        int[] dr = {-1, 1, 0, 0};
int[] dc = {0, 0, -1, 1};

            for(int j=0;j<n;j++){
                for(int k=0;k<grid[0].length;k++)
                if(grid[j][k]==1 && visited[j][k]==0){
                    visited[j][k]=1;
                    s.push(new int[]{j,k});
                   
                    count=0;

                    while(!s.isEmpty()){
                        int cell[]=s.pop();
                        count++;
                        int r=cell[0];
                        int c=cell[1];
                        for(int i=0;i<4;i++){
                            int nr=r+dr[i];
                            int nc=c+dc[i];
                            if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length){
                                if(grid[nr][nc]==1 && visited[nr][nc]==0){
                                    visited[nr][nc]=1;
                                    s.push(new int[]{nr,nc});
                                }
                            }
                
                        }

                    }
              max = Math.max(max, count);}
            }
        
        
    return max;}
}
