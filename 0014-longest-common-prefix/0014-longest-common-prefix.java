class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs[0].length() == 0)
    return "";
        String s="";
        int p=0;
        while(p<strs[0].length()){
        char c= strs[0].charAt(p);
        
        for(int j=1;j<strs.length;j++){
            if(p>=strs[j].length()||strs[j].charAt(p)!=c) return s;
           
                }
                s+=c;
        p++;
        }
        return s;
    }
}