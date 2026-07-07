class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=1;
        int high=position[position.length-1]-position[0];
        int ans=high;
        int index=0;
        while(low<=high){
            index=0;
            int placed=1;
            int dist=low+(high-low)/2;
            for(int i=1;i<position.length;i++){
                if(position[i]-position[index]>=dist){
                    placed++;
                    index=i;
                }
            }
            if(placed>=m){
                ans=dist;
                low=dist+1;
            }else
            high=dist-1;
        }
        
    return ans;}
}
