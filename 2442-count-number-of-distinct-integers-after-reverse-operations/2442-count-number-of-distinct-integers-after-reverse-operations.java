class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            int s=0;
            while(x>0){
                s=s*10+x%10;
                x=x/10;
            }
            hs.add(s);
        }
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        return hs.size();
    }
}