class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int maxLen = 0;
        for(int num : nums){
            if(!seen.contains(num)){
                seen.add(num);
            }
        }
        for(int num : seen){
            int count = 0;
            if(!seen.contains(num-1)){
                while(seen.contains(num + count)){
                    count++;
                }
                if(maxLen < count){
                    maxLen = count;
                }
            }
        }
    return maxLen;
    }
}