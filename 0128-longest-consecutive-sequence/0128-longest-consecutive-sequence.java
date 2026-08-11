class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int res=0;
        HashSet<Integer> hs =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        for(int i:hs){
            if(!hs.contains(i-1)){
                int x=i;
                int c=1;
                while(hs.contains(i)){
                    i++;
                    c++;
                }
                res=Math.max(c,res);
            }
        }
        return res-1;
    }
}