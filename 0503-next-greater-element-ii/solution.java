class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=-1;
        }
        int answer=-1;
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<2*nums.length;i++){
            while(!stack.isEmpty() && nums[i%nums.length]>nums[stack.peek()]){
               answer=stack.removeFirst(); 
               ans[answer]=nums[i%nums.length];
            }
            if(i<nums.length){
            stack.addFirst(i);
            }
           
        }
        
    return ans;}
}
