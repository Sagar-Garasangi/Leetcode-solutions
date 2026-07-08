class Solution {
    public boolean isValid(String s) {
        Deque <Character> stack=new ArrayDeque<>();
        char ch;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.addFirst(s.charAt(i));
            }else
            {
            if(stack.isEmpty()){
                return false;
            }
            ch=stack.peekFirst();
            if(ch=='(' && s.charAt(i)==')')
                stack.removeFirst();
                
            else if(ch=='[' && s.charAt(i)==']')
                stack.removeFirst();
                
            else if(ch=='{' && s.charAt(i)=='}')
                stack.removeFirst();
                
            else 
            return false;
            }

                
            }
return stack.isEmpty();        }

    }

