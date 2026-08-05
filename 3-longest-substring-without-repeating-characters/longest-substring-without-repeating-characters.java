class Solution {
    public int lengthOfLongestSubstring(String s) {
      char[] chars = s.toCharArray();
      HashSet<Character> set = new HashSet<>();
      int lp = 0;
      int maxSubString = 0;
      for(int rp = 0; rp < chars.length; rp++){
        while(set.contains(chars[rp])){
            set.remove(chars[lp]);
            lp++;
        }
        set.add(chars[rp]);
        maxSubString = Math.max(maxSubString, rp-lp+1);
        }  
      return maxSubString;
    }
}   