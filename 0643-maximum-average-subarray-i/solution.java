class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currentsum=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
            currentsum=currentsum+nums[i];
            maxsum=currentsum;
        }
        for(int i=k;i<nums.length;i++){
            currentsum=currentsum+nums[i]-nums[i-k];
            maxsum=Math.max(maxsum,currentsum);
        }
        return (double)maxsum/k;
        
    }
}
