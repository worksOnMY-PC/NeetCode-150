class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map1 = new HashMap<>();
        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(map1.containsKey(key) == false){
                map1.put(key, new ArrayList<String>());
            }
            map1.get(key).add(s);
        }
        return new ArrayList<List<String>>(map1.values());
    }
}