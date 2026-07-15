class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] Answer = new int[nums.length];
        Arrays.fill(Answer, 1);
        for(int i = 1; i < nums.length; i++){
            Answer[i] = Answer[i-1]*nums[i-1];
        }
        int suffix = 1;
        for(int i = nums.length-2; i >= 0; i--){
            suffix *= nums[i+1];
            Answer[i] = Answer[i]*suffix;
        }
        return Answer;
    }
}