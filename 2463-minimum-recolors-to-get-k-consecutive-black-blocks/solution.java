class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whitecount=0;
        int min=Integer.MAX_VALUE;
        int left=0;
        for(int right=0;right<blocks.length();right++){
             if(blocks.charAt(right)=='W'){
                whitecount=whitecount+1;}
            if(right-left+1==k){
                min=Math.min(min,whitecount);
                if(blocks.charAt(left)=='W'){
                    whitecount=whitecount-1;
                    left++;
                }else
                left++;  
            }
            

        }
        
    return min;}
}
