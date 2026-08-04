class Solution {
    public int[] getFinalState(int[] n, int k, int m) {
        int p=0,ii=0,min=0;
        while(p<k){
            min=n[0];
            ii=0;
            for(int i=0;i<n.length;i++){
             if(n[i]<min){
                min=n[i];
                ii=i;
             }}
             n[ii]*=m;
             p++;
            
            
        }
        return n;
    }
}