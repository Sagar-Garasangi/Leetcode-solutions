class Solution {
    public int mySqrt(int x) {
        int low=0;
       int high=x;
       int ans=0;
       if(x>1)
       high=x/2;
       while(low<=high){
        int mid=low+(high-low)/2;
        long squ=(long) mid*mid;
        if(squ<=x){
            ans=mid;
            low=mid+1;
       }else
       high=mid-1;
       }
       
        
  return ans;  }
}
