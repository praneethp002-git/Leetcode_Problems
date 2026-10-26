class Solution {
    public int peakValleyDifference(int[] nums) {
        int s=0,ss=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]&&nums[i]>nums[i-1]){
                s+=nums[i];
            }
            else if(nums[i]<nums[i+1]&&nums[i]<nums[i-1]){
                ss+=nums[i];
            }
        }
        return s-ss;
    }
}