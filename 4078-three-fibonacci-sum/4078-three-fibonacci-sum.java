class Solution {
    public boolean threeFibonacciSum(int n) {
        int x=0,y=1,z=1;
        int arr[]=new int[50];
        int k=2;
        int sum=0;
        arr[0]=x;
        arr[1]=y;
        while(true){
            sum=x+y;
            
            if(sum>n)  break;
            arr[k++]=sum;
            x=y;
            y=sum;
            
        }
        // return false;
        for(int i=0;i<k-2;i++){
            if(arr[i]+arr[i+1]+arr[i+2]==n){
                return true;
            }
            // else if(arr[i]+arr[i+1]+arr[i+2]>n){
            //     return false;
            
        }
        return false;
    }
}