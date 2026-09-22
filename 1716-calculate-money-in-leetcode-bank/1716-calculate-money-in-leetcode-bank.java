class Solution {
    public int totalMoney(int n) {
        int k=1,p=1,s=0;
        for(int i=1;i<=n;i++){
            if(i%7==1 &&i != 1){
                 p++;
                k=p;
               
            }
            s=s+k;
            k++;
        }
        return s;
    }
}