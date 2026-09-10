class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
    List<Integer> l=new ArrayList<>();
    HashSet<Integer> hs=new HashSet<>();
    for(int i=0;i<nums1.length;i++){
        hs.add(nums1[i]);
    }
    HashSet<Integer> hs2=new HashSet<>();
    for(int i=0;i<nums2.length;i++){
        if(hs.contains(nums2[i])){
            hs2.add(nums2[i]);
        }
    } HashSet<Integer> hs3=new HashSet<>();
    for(int i=0;i<nums3.length;i++){
         if(hs.contains(nums3[i])){
            hs3.add(nums3[i]);
        }
    }  
     HashSet<Integer> hss=new HashSet<>();
    for(int i=0;i<nums2.length;i++){
        hss.add(nums2[i]);
    }
    HashSet<Integer> hs33=new HashSet<>();
   for(int i=0;i<nums3.length;i++){
         if(hss.contains(nums3[i])){
            hs33.add(nums3[i]);
        }
    }  
    HashSet<Integer> hse=new HashSet<>();
    for(int i:hs33){
        hse.add(i);
    }
     for(int i:hs3){
        hse.add(i);
    }
     for(int i:hs2){
        hse.add(i);
    }
    for(int i:hse){
        l.add(i);
    }
    return l;
    }
}