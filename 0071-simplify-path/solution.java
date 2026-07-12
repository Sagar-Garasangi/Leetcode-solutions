class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        String ans="";
        StringBuilder sb = new StringBuilder();
        Deque<String> stack=new ArrayDeque<>();
        for(String x: parts){
            if(x.equals(".")){
                continue;
            }else if(x.equals("..")){
                if(!stack.isEmpty())
                stack.pop();
            }else if(x.equals("")){
                continue;
            }else{
                stack.push(x);
            }
        }
        if(!stack.isEmpty()){
        while(!stack.isEmpty()){
            sb.append("/");
            sb.append(stack.removeLast());
        }}else
        sb.append("/");

        ans=sb.toString();
        
        
  return ans;  }
}
