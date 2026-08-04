class Solution {
    public int maxArea(int[] height) {
        int currentMaxArea = 0;
        int minHeight = 0;
        int maxArea = 0;
        int lp = 0;
        int rp = height.length - 1;
        for(int val : height){
            if(height[lp]<height[rp]){
                minHeight = height[lp];
                maxArea = minHeight*(rp-lp);
                lp++;
            }else{
                minHeight = height[rp];
                maxArea = minHeight*(rp-lp);
                rp--;
            }
            if(currentMaxArea < maxArea){
                currentMaxArea = maxArea;
            }
        }
        return currentMaxArea;
    }
}