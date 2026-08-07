class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freqS1 = new int[26];
        char[] charsS1 = s1.toCharArray();
        char[] charsS2 = s2.toCharArray();

        for(int i = 0; i < charsS1.length; i++){
            freqS1[charsS1[i] - 'a']++;
        }
        
        int windowLength = charsS1.length;

        for(int i = 0; i < charsS2.length; i++){
            int windowIdx = 0, idx = i;
            int[] windowFreq = new int[26];

            while(windowIdx < windowLength && idx < charsS2.length){
                windowFreq[charsS2[idx] - 'a']++;
                idx++; windowIdx++;
            }

            if(Arrays.equals(freqS1, windowFreq)){
                return true;
            }
        }
        return false;
    }
}