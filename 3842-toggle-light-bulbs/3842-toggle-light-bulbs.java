class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> b) {
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i=0;i<b.size();i++){
            hm.put(b.get(i),hm.getOrDefault(b.get(i),0)+1);
        }
        List<Integer> l=new ArrayList<>();
        for(int i:hm.keySet()){
            if(hm.get(i)%2!=0) l.add(i); 
        }
        Collections.sort(l);
        return l;
    }
}