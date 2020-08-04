/**
 * @author : Anmol Agrawal
 */
/* Logic 1: */
/*
class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        while(n > 0){
            n /= 5;
            ans += n;
        }
        return ans;
    }
}
*/
/* Logic 2: Recursion */
class Solution {
    public int trailingZeroes(int n) {
        if(n == 0) return 0;
        return (n / 5) + trailingZeroes(n / 5);
    }
}