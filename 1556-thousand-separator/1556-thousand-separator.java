class Solution {
    public String thousandSeparator(int n) {
        int p=0;
        StringBuilder s=new StringBuilder();
        if(n==0) return "0";
        while(n!=0){
            if(p>2){
                s.append(".");
                p=0;
            }
            s.append(n%10);
            p++;
            n=n/10;
        }
        s.reverse();
        return s.toString();
    }
}