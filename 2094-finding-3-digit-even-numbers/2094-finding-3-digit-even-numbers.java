class Solution {
    public int[] findEvenNumbers(int[] d) {
          int c=0;
          Arrays.sort(d);
          int p=0;
         
          ArrayList<Integer> ar=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<d.length;i++){
            if(d[i]!=0){
            for(int j=0;j<d.length;j++){
                if(i!=j){
                for(int k=0;k<d.length;k++){
                    int s=1;
                    if(i!=j&&j!=k&&i!=k){
                        s=d[i]*100;
                        s=d[j]*10+s;
                        s=d[k]+s;
                       
                        if(s%2==0&&!hs.contains(s)){
                            ar.add(s);
                             hs.add(s);
                        }
                 
                    }
                }}
            }}}
             int arr[]=new int[ar.size()];
             for(int i=0;i<arr.length;i++){
                arr[i]=ar.get(i);
             }
            return arr;
        
    }
}