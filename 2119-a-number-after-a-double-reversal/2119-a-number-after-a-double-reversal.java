class Solution {
    public boolean isSameAfterReversals(int num) {
        int p=num;
        int s=0,q=0;
        while(p!=0){
            s=s*10+p%10;
            p=p/10;
        }
         while(s!=0){
            q=q*10+s%10;
            s=s/10;
        }
        return q==num;
    }
}