/**
* @author : Anmol Agrawal
*/
class Solution {
    public String reverseWords(String s) {
        String strs[] = s.trim().split(" ");
        String o = "";
        for(int i = strs.length - 1; i >= 0; i--){
            String x = strs[i];
            if(x.length() > 0){
                o = o + x + " ";
            }
        }
        return o.trim();
    }
}
