class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l=new ArrayList<>();
        if (p.length() > s.length())
            return l;
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<p.length();i++){
            sb.append(s.charAt(i));
        }
       char []a =sb.toString().toCharArray();
       Arrays.sort(a);
       char[]b=p.toCharArray();
       Arrays.sort(b);
       if(Arrays.equals(a,b)) l.add(0);
       for(int i=p.length();i<s.length();i++){
        sb.deleteCharAt(0);
        sb.append(s.charAt(i));
         char []aa =sb.toString().toCharArray();
       Arrays.sort(aa);
       if(Arrays.equals(aa,b)) l.add(i-p.length()+1);
       }
       return l;
    }
}