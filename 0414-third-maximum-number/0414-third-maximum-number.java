class Solution {
    public int thirdMax(int[] nums) {
      TreeSet<Integer> ts=new TreeSet<>();
      int k=0;
      for(int i=0;i<nums.length;i++){
        ts.add(nums[i]);
      }
      if(ts.size()<3){
        return ts.last();
      }
      for(int i:ts){
        if(k==ts.size()-3){
            return i;
        }
        k++;
      }
      return -1;
    }}