class Solution {
    public int smallestNumber(int n, int t) {
     for(int i=n;i<=n+10;i++){ 
        int pr=1;
        int r=i;
        while(r!=0){
           int q=r%10;
           pr=pr*q;
            r=r/10;
        }
        if(pr%t==0){
            return i;
        }
     }
     return -1;
    }
}