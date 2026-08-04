class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp = 0;
        int rp = numbers.length - 1;
        for(int nums : numbers){
            if(numbers[lp]+numbers[rp] == target){
                return new int[] {lp+1, rp+1};
            }else if(numbers[lp]+numbers[rp] < target){
                lp++;
            }else if(numbers[lp]+numbers[rp] > target){
                rp--;
            }
        }
        return new int[] {-1, -1};
    }
}