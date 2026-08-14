class Solution {
    public int missingInteger(int[] nums) {
        int p=0;
       for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]+1){
            p+=nums[i];
        }
        else break;
       }
        p+=nums[0];
      HashSet<Integer> hs=new HashSet<>();
      for(int i=0;i<nums.length;i++){
        hs.add(nums[i]);
      } 
      while(hs.contains(p)){
        p++;
      }
      return p;
       
    }
}