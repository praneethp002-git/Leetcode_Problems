class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        StringBuilder sb=new StringBuilder();
//         char[] arr = s2.toCharArray();
// Arrays.sort(arr);
// String s = new String(arr);
char ar[]=s1.toCharArray();
Arrays.sort(ar);
// String S=new String(ar);
 for(int i=0;i<s1.length();i++){
    sb.append(s2.charAt(i));
 }
 char a[]=sb.toString().toCharArray();
Arrays.sort(a);
if(Arrays.equals(a,ar)) return true;
for(int i=s1.length();i<s2.length();i++){
    sb.deleteCharAt(0);
    sb.append(s2.charAt(i));
    char aa[]=sb.toString().toCharArray();
Arrays.sort(aa);
if(Arrays.equals(aa,ar)) return true;
}
return false;
    }
}