class Solution {
    public int trap(int[] height) {
        int left = 1;
        int right = height.length-2;
        int lmax = height[left-1];
        int rmax = height[right+1];
        int trapWater = 0;
        while(left<=right){
            if(lmax>=rmax){
                trapWater+= Math.max(0,rmax-height[right]);
                rmax = Math.max(rmax,height[right]);
                right--;
            }else{
                 trapWater+= Math.max(0,lmax-height[left]);
                lmax = Math.max(lmax,height[left]);
                left++;
            }
        }
        return trapWater;
    }
}
