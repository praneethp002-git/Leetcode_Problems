class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int p=0;
            for(int j=i+1;j<arr.length;j++){
                if(p<arr[j]){
                    p=arr[j];
                }
                arr[i]=p;
            }
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}