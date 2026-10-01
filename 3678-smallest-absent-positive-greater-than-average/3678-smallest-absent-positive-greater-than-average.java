class Solution {
    public int smallestAbsent(int[] nums) {
        int sum=0;
        
                   HashSet<Integer> hs =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            hs.add(nums[i]);
        }

        sum=sum/nums.length;
        if(sum<0) sum= 0;
        sum++;
           while(true){
            if(!hs.contains(sum)) return sum;
            else sum++;
           }
        // return 11;
    }
}