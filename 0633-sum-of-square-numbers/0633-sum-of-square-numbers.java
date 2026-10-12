class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0;
        long j=(long)Math.sqrt(c);
        if(c==0) return true;
        while(i<j){
            if(((i*i)+(j*j))==c){
                return true;
            }
            else if(((i*i)+(i*i))==c) return true;
            else if(((j*j)+(j*j))==c) return true;
            else if(((i*i)+(j*j))>c) j--;
            else i++;
        }
        return false;
    }
}