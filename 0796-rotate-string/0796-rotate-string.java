class Solution {
    public boolean rotateString(String s, String g) {
        if(s.length()!=g.length()) return false;
        s=s+s;
        if(s.contains(g)) return true;
        else return false;
    }
}