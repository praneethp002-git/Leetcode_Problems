class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int c=0,c1=0;
           HashSet<Integer> hs1=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            hs1.add(nums2[i]);
        }
        for(int i:hs1){
            for(int j=0;j<nums1.length;j++){
                if(i==nums1[j]){
                    c++;
                }
            }
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }
        for(int i:hs){
            for(int j=0;j<nums2.length;j++){
                if(i==nums2[j]){
                    c1++;
                }
            }
        }
        int arr[]=new int[2];
         arr[0]=c;
         arr[1]=c1;
         return arr;
    }
}