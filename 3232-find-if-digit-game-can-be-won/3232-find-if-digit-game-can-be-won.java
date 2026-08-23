class Solution {
    public boolean canAliceWin(int[] nums) {
        int res=0;
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=10){
                res+=nums[i];
            }
            else p+=nums[i];
        }
        return res!=p;
    }
}