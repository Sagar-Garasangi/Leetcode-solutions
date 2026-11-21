class Solution {
    public int numEnclaves(int[][] grid) { 
        boolean visited[][]=new boolean[grid.length][grid[0].length];
        Stack<int[]> s=new Stack<>();
        for(int i=0;i<grid[0].length;i++){
            if(grid[0][i]==1 && !visited[0][i]){
                visited[0][i]=true;
                s.push(new int[]{0,i});
            }
            if(grid[grid.length-1][i]==1 && !visited[grid.length-1][i]){
                visited[grid.length-1][i]=true;
                s.push(new int[]{grid.length-1,i});
            }
        
        }
        for(int i=0;i<grid.length;i++){
            if(grid[i][0]==1 && !visited[i][0]){
                visited[i][0]=true;
                s.push(new int[]{i,0});
            }
            if(grid[i][grid[0].length-1]==1 && !visited[i][grid[0].length-1]){
                visited[i][grid[0].length-1]=true;
                s.push(new int[]{i,grid[0].length-1});
            }
        
        }
        int count=0;
        int []dr={-1,1,0,0};
        int []dc={0,0,-1,1};
        while(!s.isEmpty()){
            int []cell=s.pop();
            int r=cell[0];
            int c=cell[1];
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length){
                    if(grid[nr][nc]==1 && !visited[nr][nc]){
                        visited[nr][nc]=true;
                        s.push(new int[]{nr,nc});
                    }
                }
            }

        }
        for(int i=0;i<visited.length;i++){
            for(int j=0;j<visited[0].length;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    count++;
                }
            }
        }
    
        
    return count;}
}
