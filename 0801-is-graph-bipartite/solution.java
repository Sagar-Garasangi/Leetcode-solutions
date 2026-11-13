class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<Integer> q=new ArrayDeque<>();
        int [] color=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(color[i]==0){
                color[i]=1;
                q.offer(i);
            }
            while(!q.isEmpty()){
                int node=q.poll();
                for(int x:graph[node]){
                    if(color[x]==0){
                        color[x]=-color[node];
                        q.offer(x);
                    }
                    else if(color[node]==color[x]){
                        return false;
                    }
                }
            }
        }
        
    return true;}
}
