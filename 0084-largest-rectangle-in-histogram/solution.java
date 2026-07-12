class Solution {
    public int largestRectangleArea(int[] heights) {
        int [] previndex=new int [heights.length];
        int [] nextindex=new int [heights.length];
        int max=Integer.MIN_VALUE;
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<heights.length;i++){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                previndex[i]=stack.peek();
            
            }else{
            previndex[i]=-1;
           }

            stack.push(i);
        }
        stack.clear();
        for(int i=heights.length-1;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                nextindex[i]=stack.peek();
            
            }else{
            nextindex[i]=heights.length;
           }

            stack.push(i);
        }
        for(int i=0;i<heights.length;i++){
            int width=nextindex[i]-previndex[i]-1;
            int area=heights[i]*width;


          max=Math.max(max,area);
        }
        
    return max;}
}
