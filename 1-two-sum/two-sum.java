class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            int x = target - cur;
            if(pairs.containsKey(x)){
                return new int[] {pairs.get(x),i};
            }else{
                pairs.put(cur,i);
            }
        }
        return new int[]{-1, -1};
    }
}
