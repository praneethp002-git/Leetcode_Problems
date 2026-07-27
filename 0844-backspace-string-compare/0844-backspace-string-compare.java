class Solution {
    public boolean backspaceCompare(String s, String p) {
       Stack<Character> st=new Stack<>();
       Stack<Character> st1=new Stack<>();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='#'&&!st.isEmpty()){
st.pop();
        }
        else if(s.charAt(i)!='#') st.push(s.charAt(i));
       }
        for(int i=0;i<p.length();i++){
        if(p.charAt(i)=='#'&&!st1.isEmpty()){
st1.pop();
        }
        else if(p.charAt(i)!='#') st1.push(p.charAt(i));
       }
       return st.equals(st1);
    }
}