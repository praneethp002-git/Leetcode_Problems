class Solution {
    public int smallestIndex(int[] nums) {
        int n=0,z=0,sum=0,x=0,k=0;
        for(int i=0;i<nums.length;i++){
            x=nums[i];
            sum=0;
            while(x>0){
                z=x%10;
                sum=z+sum;
                x=x/10;
            }
            if(i==sum){
                // return i;
                n=i;
                k=1;
                break;
            }
        }
        if(n==0&&k!=1){
            n=-1;
        }
        return n;
    }
}