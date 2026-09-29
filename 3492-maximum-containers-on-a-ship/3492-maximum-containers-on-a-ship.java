class Solution {
    public int maxContainers(int n, int w, int m) {
        n=n*n;
        int c=0;
       int  p=0;
       int q=0;
        while(m>p&&q<n){
             p=p+w;
             if(m<p) break;
            c++;
            q++;
    
        }
        return c;
    }
}