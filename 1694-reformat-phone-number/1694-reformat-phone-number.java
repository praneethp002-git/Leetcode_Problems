class Solution {
    public String reformatNumber(String number) {
        StringBuilder sb=new StringBuilder();
        StringBuilder p=new StringBuilder();
        for(int i=0;i<number.length();i++){
            if(Character.isDigit(number.charAt(i))){
                sb.append(number.charAt(i));
            }
        }
        // if(sb.length()<3) return sb.toString();
        // while(sb.length()>0){
            // int q=0,r=0;
        while(sb.length()>4){
            p.append(sb.substring(0,3)).append("-");
            sb.delete(0,3);
            // r++;
        }
        if(sb.length()==4){
              p.append(sb.substring(0,2)).append("-");
            sb.delete(0,2);
            // q++;
        }
        // p.append("-");
          if (sb.length() > 0) {
            p.append(sb);
        }
        
        return p.toString();
    }
}