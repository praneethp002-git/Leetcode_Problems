class Solution {
    public int integerReplacement(int n) {
        if(n==2147483647) return 32;
        int c=0;
        while(n>1){
            if(n%2==0){
                n=n/2;
                c++;
            }
            else {  if(n==3||n%4==1)
                    n=n-1;
                else
                    n=n+1;
                    c++;}
        }
        return c;
    }
}