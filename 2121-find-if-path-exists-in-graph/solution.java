class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Queue<Integer> q=new ArrayDeque<>();
        List<List<Integer>> adj=new ArrayList<>();
        boolean [] visited=new boolean[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] x:edges){
            int u=x[0];
            int v=x[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        visited[source]=true;
        q.offer(source);
        while(!q.isEmpty()){
            int node=q.poll();
            if(node==destination){
                return true;
            }
            for(int neighbour: adj.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    q.offer(neighbour);
                }
            }
        }
        
    return false;}
}
