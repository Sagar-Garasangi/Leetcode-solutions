class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = 0;
        int totalWeight = 0;
        int d=1;
        int ans=0;
        int current=0;

        for (int weight : weights) {
            maxWeight = Math.max(maxWeight, weight);
            totalWeight += weight;
        }
        int low = maxWeight;
        int high = totalWeight;
        while(low<=high){
            d=1;
            current=0;
            int mid=low+(high-low)/2;
            for(int i=0;i<weights.length;i++){
                if(current+weights[i]<=mid){
                current+=weights[i];
                }
                else{
                current=weights[i];
                d++;}
            }
             if(d<=days){
                ans=mid;
                high=mid-1;
             }else
             low=mid+1;
          

       
        }
        
    return ans;}
}
