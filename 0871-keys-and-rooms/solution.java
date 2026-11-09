class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean [] visited=new boolean[rooms.size()];
        Queue<Integer> q=new ArrayDeque<>();

        visited[0]=true;
        q.offer(0);
        while(!q.isEmpty()){
            int node=q.poll();
            for(int x:rooms.get(node)){
                if(!visited[x]) {
                    visited[x]=true;
                    q.offer(x);
                }
            }
        }
        for (boolean v : visited) {
    if (!v) {
        return false;
    }
}

return true; 


        
    }
}
