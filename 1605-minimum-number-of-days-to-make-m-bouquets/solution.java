class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low=1;
        int max=0;
        int cons=0;
        int bloom=0;
        int ans=-1;
        for(int currentmax:bloomDay){
            max=Math.max(currentmax,max);
        }
        int high=max;
        while(low<=high){
            int day=low+(high-low)/2;
            bloom=0;
            cons=0;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=day){
                    cons++;
                    if(cons==k){
                    bloom++;
                    cons=0;
                }
                }
                else
                    cons=0;
            }

                if(bloom>=m){
                    ans=day;
                    high=day-1;
                }else
                low=day+1;

            
        }

        
    return ans;}
}
