class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int s=0,p=0;
        for(int i=0;i<costs.length;i++){
            if(s+costs[i]<=coins){
                s=s+costs[i];
                p++;
            }
            else return p;
            
        }
        return p;
    }
}