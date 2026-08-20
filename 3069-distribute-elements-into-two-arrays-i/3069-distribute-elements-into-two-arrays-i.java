class Solution {
    public int[] resultArray(int[] nums) {
        int arr[]=new int[nums.length];
        int a[]=new int[nums.length];
        int k=0;
        int p=0;
        arr[k++]=nums[0];
        a[p++]=nums[1];
        for(int i=2;i<nums.length;i++){
            if(arr[k-1]>a[p-1]) arr[k++]=nums[i];
            else a[p++]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i]=arr[i];
        }
        for(int i=0;i<p;i++){
            nums[k++]=a[i];
        }
        return nums;
    }
}