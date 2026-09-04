class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int s=0;
       HashMap<Integer,Integer>hm=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
       } 
       for(int i:hm.keySet()){
        if(hm.get(i)%k==0)
        s+=i*hm.get(i);
       }
       return s;
    }
}