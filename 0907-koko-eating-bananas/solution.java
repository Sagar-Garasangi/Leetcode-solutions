class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxpile = 0;
        for (int pile : piles) {
            maxpile = Math.max(maxpile, pile);
        }
        double hour=0;
        int low=1;
        int high=maxpile;
        int ans=maxpile;
        while(low<=high){
            hour=0;
            int mid=low+(high-low)/2;
            for(int i=0;i<piles.length;i++){
            hour += (piles[i] + mid - 1) / mid;
            }
            if(hour<=h){
                ans=mid;
                high=mid-1;
            }else
            low=mid+1;
            
        }
        
    return ans;}
}
