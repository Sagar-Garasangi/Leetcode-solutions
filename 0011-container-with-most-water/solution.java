class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxarea=0;
        while(i<j){
            int temp=(Math.min(height[i],height[j])*(j-i));
            maxarea=Math.max(maxarea,temp);

            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        
        }
        
    return maxarea;}
}
