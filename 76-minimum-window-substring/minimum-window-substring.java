class Solution {
    private boolean containsChar(int[] mapS, int[] mapT){
    for(int i = 0; i < 128; i++){
        if(mapT[i] > mapS[i]){
            return false;
        }
    }
    return true;
}
    public String minWindow(String s, String t) {
        int[] mapS = new int[128];
        int[] mapT = new int[128];

        for(char ch : t.toCharArray()) mapT[ch]++;

        int lp = 0;
        int rp = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        for(;rp < s.length(); rp++){
            mapS[s.charAt(rp)]++;

            while(containsChar(mapS, mapT)){
                if(rp - lp + 1 < minLen){
                    minLen = rp - lp + 1;
                    minStart = lp;
                }
                mapS[s.charAt(lp++)]--;
            }
        }
        if( minLen == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(minStart, minStart + minLen);
    }
}
