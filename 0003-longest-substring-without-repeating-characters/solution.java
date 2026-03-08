import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j=0;
        int max=0;
        HashSet set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            max=Math.max(max,i-j+1);

        }
      return max;  
        
    }
}
