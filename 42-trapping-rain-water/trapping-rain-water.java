class Solution {
    public int trap(int[] height) {
        int lmax = 0;
        int rmax = 0;
        int n = height.length;
        int lp = 0;
        int rp = n - 1;
        int totalWater = 0;
        while(lp < rp){
            lmax = Math.max(lmax, height[lp]);
            rmax = Math.max(rmax, height[rp]);

            if(lmax < rmax){
                totalWater += lmax - height[lp];
                lp++;
            }else{
                totalWater += rmax - height[rp];
                rp--;
            }
        }
        return totalWater;
    }
}