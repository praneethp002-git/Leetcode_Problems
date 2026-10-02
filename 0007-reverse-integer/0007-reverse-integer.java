class Solution {
    public int reverse(int x) {
        long s=0;
       
      if(x>0){
      while(x>0){
        int p=x%10;
        s=p+s*10;
         if (s > Integer.MAX_VALUE  ||s < Integer.MIN_VALUE ) {
                return 0;
            }
        x=x/10;
        // s=s*(-1);
      }}
      else{
        while(x<0){
        int p=x%10;
        s=p+s*10;
         if (s > Integer.MAX_VALUE  ||s < Integer.MIN_VALUE) {
                return 0;
            }
        x=x/10;
      }
      }
    //    if (s > Integer.MAX_VALUE/10  ||s < Integer.MIN_VALUE/10 ) {
    //             return 0;
    //         }
    return (int)s;
    }

}