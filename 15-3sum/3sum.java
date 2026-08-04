class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
            continue;
            }
            int lp = i+1;
            int rp = nums.length - 1;
            while(lp<rp){
                if(nums[i]+nums[lp]+nums[rp] == 0){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[lp]);
                    triplet.add(nums[rp]);
                    result.add(triplet);
                    lp++;
                    rp--;
                    while(lp < rp && nums[lp] == nums[lp-1]){
                        lp++;
                    }
                    while(lp < rp && nums[rp] == nums[rp+1]){
                        rp--;
                    }
                }else if(nums[i]+nums[lp]+nums[rp] < 0){
                    lp++;
                    while(lp < rp && nums[lp] == nums[lp-1]){
                        lp++;
                    }
                }
            else if(nums[i]+nums[lp]+nums[rp] > 0){
                rp--;
                while(lp < rp && nums[rp] == nums[rp+1]){
                    rp--;
                }
            }
           }
        }
    return result;
    }
}