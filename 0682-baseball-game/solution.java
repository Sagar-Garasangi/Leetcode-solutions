class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack=new ArrayDeque<>();
        int sum=0;
        int temp=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                if(!stack.isEmpty()){
                    int first=stack.pop();
                    int secound=first+stack.peek();
                    stack.push(first);
                    stack.push(secound);
                }
            }else if(operations[i].equals("D")){
                temp=stack.peek();
                temp=temp*2;
                stack.push(temp);
            }else if(operations[i].equals("C")){
                stack.pop();
            }else
            stack.push(Integer.parseInt(operations[i]));
        }
        while(!stack.isEmpty()){
            sum=sum+stack.pop();
        }
        
    return sum;}
}
