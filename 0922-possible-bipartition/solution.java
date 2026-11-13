class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> adj=new ArrayList<>();
        Queue<Integer> q=new ArrayDeque<>();
        int []colored=new int[n+1];
        for(int i=0;i<n+1;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] x:dislikes){
            int u=x[0];
            int v=x[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for(int i=1;i<n+1;i++){
        if(colored[i]==0){
            colored[i]=1;
            q.offer(i);
        }
        while(!q.isEmpty()){
            int node=q.poll();
            for(int neighbour:adj.get(node)){
            if(colored[neighbour]==0){
                colored[neighbour]=-colored[node];
                q.offer(neighbour);
            }else if(colored[neighbour]==colored[node]){
                return false;
            }
            }
        }
        }


        
    return true;}
}
