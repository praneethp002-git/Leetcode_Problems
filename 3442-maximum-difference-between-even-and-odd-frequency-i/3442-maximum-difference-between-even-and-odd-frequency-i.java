class Solution {
    public int maxDifference(String s) {
       HashMap<Character,Integer> hm=new HashMap<>();
       for(int i=0;i<s.length();i++){
        hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
       }
       int res=Integer.MIN_VALUE;
       HashSet<Integer> hs=new HashSet<>();
       HashSet<Integer> hss=new HashSet<>();
        for(char i:hm.keySet()){
            if(hm.get(i)%2==0){
                hs.add(hm.get(i));
            }
            else {hss.add(hm.get(i));}
        }
        for(int i:hss){
            for(int j:hs){
           res=Math.max(res,i-j);
            }
        }
        return res;
    }
}