class Solution {
    public int findClosest(int x, int y, int z) {
        int p=Math.abs(x-z);
        int q=Math.abs(y-z);
        int r=Math.min(p,q);
       if (p < q) return 1;
        else if (q < p) return 2;
        return 0;
    }
}