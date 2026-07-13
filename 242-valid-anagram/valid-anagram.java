class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }else{
            HashMap<Character, Integer> MapS = new HashMap<>();
            HashMap<Character, Integer> MapT = new HashMap<>();
            for(char ch : s.toCharArray()){
                MapS.put(ch, MapS.getOrDefault(ch, 0)+1);
            }
            for(char ch: t.toCharArray()){
                MapT.put(ch, MapT.getOrDefault(ch, 0)+1);
            }
            if(MapS.equals(MapT) == true){
                return true;
            }else{
                return false;
            }
        }
    }
}