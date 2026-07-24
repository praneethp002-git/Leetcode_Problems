class Solution {
    public int countCompleteDayPairs(int[] h) {
        int c=0;
        for(int i=0;i<h.length;i++){
            int s=0;
            for(int j=i+1;j<h.length;j++){
                s=h[i]+h[j];
                if(s%24==0) c++;
            }
            
        }
        return c;
    }
}