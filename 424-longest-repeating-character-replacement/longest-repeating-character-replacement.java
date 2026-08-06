class Solution {
    public int characterReplacement(String s, int k) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int lp = 0;
        int maxFreq = 0;
        int maxWindow = 0;
        for(int rp = 0; rp < chars.length; rp++){
            //update the current character count
            freqMap.put(chars[rp], freqMap.getOrDefault(chars[rp], 0)+1);

            maxFreq = Math.max(maxFreq, freqMap.get(chars[rp]));

            int windowLength = rp - lp + 1;
            
            //shrink the window
            if(windowLength - maxFreq > k){
                freqMap.put(chars[lp], freqMap.getOrDefault(chars[lp], 0)-1);
                lp++; 
            }
            windowLength = rp - lp + 1;
            maxWindow = Math.max(maxWindow, windowLength);

        }
        return maxWindow;
    }
}