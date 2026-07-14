class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> num_map = new HashMap<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
                num_map.put(nums[i], num_map.getOrDefault(nums[i],0)+1);  
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> num_map.get(b) - num_map.get(a));
        pq.addAll(num_map.keySet());
        int[] top_k = new int[k];
        for(int i = 0; i<k; i++){
            top_k[i] = pq.poll();
        }
        return top_k;
    }
}