class Solution {
    public int passwordStrength(String p) {
        int r=0;
        HashSet<Character> hs =new HashSet<>();
        for(int i=0;i<p.length();i++){
            hs.add(p.charAt(i));
        } 
        for(char c:hs){
            
            if(Character.isUpperCase(c)){
                r+=2;
            }
            else if(Character.isLowerCase(c)){
                r+=1;
            }
            else if(Character.isDigit(c)){
                r+=3;
            }
            else r+=5;
        }
        return r;
    }
}