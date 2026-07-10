class Solution {
    public int[] finalPrices(int[] prices) {
        int previndex=0;
        Deque<Integer> stack=new ArrayDeque<>();
        int [] ans=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            while(!stack.isEmpty() && prices[stack.peek()]>=prices[i]){
                previndex=stack.removeFirst();
                ans[previndex]=prices[previndex]-prices[i];
            }
            stack.addFirst(i);
            
        }
        while(!stack.isEmpty()){
            previndex=stack.removeFirst();
            ans[previndex]=prices[previndex];
        }
        
    return ans;}
}
