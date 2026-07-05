class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int ans_f=-1;
        int ans_l=-1;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                ans_f=mid;
                right=mid-1;    
            }else if(target>nums[mid]){
                left=mid+1;
            }else
            right=mid-1;
        }
        left=0;
        right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                ans_l=mid;
                left=mid+1;    
            }else if(target>nums[mid]){
                left=mid+1;
            }else
            right=mid-1;
        }

        
        
    return new int[]{ans_f, ans_l};}
}
