class Solution {
    public char repeatedCharacter(String s) {
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<s.length();i++){
        if(sb.indexOf(""+s.charAt(i))!=-1){
            return s.charAt(i);
        }
        else sb.append(s.charAt(i));
       }
       return ' ';
    }
}