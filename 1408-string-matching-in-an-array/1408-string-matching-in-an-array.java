class Solution {
    public List<String> stringMatching(String[] w) {
        List<String> l=new ArrayList<>();
        for(int i=0;i<w.length;i++){
            for(int j=0;j<w.length;j++){
                if(w[j].contains(w[i])&&i!=j){
                    l.add(w[i]);
                    break;
                }
            }
        }

        return l;
    }
}