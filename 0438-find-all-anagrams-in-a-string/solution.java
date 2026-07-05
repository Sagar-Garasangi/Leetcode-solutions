class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int[] freqp = new int[26];
        for (int i = 0; i < p.length(); i++) {
            freqp[p.charAt(i) - 'a']++;
        }

        int[] freqs = new int[26];
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            freqs[s.charAt(right) - 'a']++;

            if (right - left + 1 == p.length()) {

                if (Arrays.equals(freqp, freqs)) {
                    ans.add(left);
                }

                freqs[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return ans;
    }
}
