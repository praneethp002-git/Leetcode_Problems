class Solution {
    public int findGCD(int[] nums) {
        int res=0;
        Arrays.sort(nums);
        for(int i=1;i<=nums[nums.length-1];i++){
            if(nums[0]%i==0&&nums[nums.length-1]%i==0){
                    res=i;
                    // break;
            }
        }
        return res;
    }
}