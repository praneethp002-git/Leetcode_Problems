class Solution {
    public int countStudents(int[] s, int[] sa) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<s.length;i++){
            s1.append(s[i]);
            s2.append(sa[i]);
        }
        int r=0;
        while(s1.length()>0){
            if(s1.charAt(0)==s2.charAt(0)){
                s1.deleteCharAt(0);
                s2.deleteCharAt(0);
                r=0;
            }
            else {
                s1.append(s1.charAt(0));
            s1.deleteCharAt(0);
            r++;
            }
         if (r == s1.length()) {  
                break;
            }
        }
        return s1.length();
    }
}