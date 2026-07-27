class Solution {
    public int calPoints(String[] o) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<o.length;i++){
            char c=o[i].charAt(0);
            
            if(c=='C'&&!st.isEmpty()){
                st.pop();
            }
           else if(c=='D'){
                st.push(2*st.peek());
            }
           else if((c=='+')){
            st.push(st.peek()+st.get(st.size() - 2));
           }
           else {
           int p=Integer.parseInt(o[i]);
           st.push(p);}

        }
        int s=0;
        for (int i = 0; i < st.size(); i++) {
    s+= st.get(i);
}
return s;
    }
}