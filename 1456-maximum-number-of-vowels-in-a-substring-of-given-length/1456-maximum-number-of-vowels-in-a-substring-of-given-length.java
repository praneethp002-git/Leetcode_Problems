class Solution {
    public int maxVowels(String s, int k) {
        StringBuilder sb=new StringBuilder();
        String p="aeiou";
        for(int i=0;i<k;i++){
            sb.append(s.charAt(i));
        }
        int r=0;
        for(int i=0;i<sb.length();i++){
            if(p.indexOf(sb.charAt(i))!=-1) r++;
        }
        int q=r;
        for(int i=k;i<s.length();i++){
            sb.deleteCharAt(0);
            if(p.indexOf(s.charAt(i-k))!=-1) q--;
            sb.append(s.charAt(i));
            if(p.indexOf(s.charAt(i))!=-1) q++;
            r=Math.max(r,q);
        }
        return r;
    }
}