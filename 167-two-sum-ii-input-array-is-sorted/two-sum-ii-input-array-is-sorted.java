class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int cur = numbers[i];
            int x = target - cur;
            if(pairs.containsKey(x)){
                return new int[] {pairs.get(x)+1,i+1};
            }else{
                pairs.put(cur,i);
            }
        }
        return new int[]{-1, -1};
    }
}