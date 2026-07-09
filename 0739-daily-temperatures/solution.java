class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack=new ArrayDeque<>();
        int ans[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int answer=0;
            int current=temperatures[i];
            while(!stack.isEmpty() && current>temperatures[stack.peek()]){
                answer=stack.removeFirst();
                ans[answer]=i-answer;
            }
            stack.addFirst(i);
        }
   return ans; }
}
