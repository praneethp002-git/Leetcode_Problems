class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int maxi=0,mini=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                maxi=i;
            }
            if(nums[i]==min){
                mini=i;
            }
        }
        int mmin=Math.min(mini,maxi);
        int mmax=Math.max(mini,maxi);
        int p1=nums.length-mmin;
        int p2=mmax+1;
        int p3=(nums.length-mmax)+(mmin+1);
        p1=Math.min(p1,p2);
        p1=Math.min(p1,p3);
        return p1;
    }
}