/**
 * @author : Anmol Agrawal
 */
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(!((a >= '0' && a <= '9') || (a >= 'a' && a <= 'z'))){
                i++;
                continue;
            }
            if(!((b >= '0' && b <= '9') || (b >= 'a' && b <= 'z'))){
                j--;
                continue;
            }
            if(a != b){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}