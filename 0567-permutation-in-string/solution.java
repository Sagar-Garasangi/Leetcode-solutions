class Solution {
    public boolean checkInclusion(String s1, String s2) {
      int [] freqs1=new int[26];
        for(int i=0;i<s1.length();i++){
            freqs1[s1.charAt(i)-'a']++;
        }
        int [] freqs2=new int[26];
        int left=0;
        for(int right=0;right<s2.length();right++){
            freqs2[s2.charAt(right)-'a']++;
            if(right-left+1==s1.length()){
                if(Arrays.equals(freqs1,freqs2)){
                    return true;
                }
            freqs2[s2.charAt(left)-'a']--;
            left++;


            }
            ;
        }
        
    return false;}
}
