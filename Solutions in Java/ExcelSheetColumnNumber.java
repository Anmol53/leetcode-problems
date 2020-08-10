/**
 * @author : Anmol Agrawal
 */
 class Solution {
    public int titleToNumber(String s) {
        int e = 1;
        int ans = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            ans += (e * (s.charAt(i) - 'A' + 1));
            e *= 26;
        }
        return ans;
    }
}
