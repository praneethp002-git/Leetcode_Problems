class Solution {
    public int missingMultiple(int[] nums, int k) {
        TreeSet<Integer> l=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
                l.add(nums[i]);
            }
        }
        // int p=l.last();
        int p=1;
       for(int i:l){
        if(i!=k*p){
            return k*p;
        }
        p++;
       }
       if(p==l.size()+1) return p*k; 
       return -1;
    }
}