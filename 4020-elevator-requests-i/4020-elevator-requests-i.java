class Solution {
    public int elevatorRequests(int n, int[] r) {
        int p=r[0];
        for(int i=0;i<r.length-1;i++){
            p+=(int)Math.abs(r[i]-r[i+1]);
        }
        return p;
    }
}