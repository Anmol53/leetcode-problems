/**
 * @author : Anmol Agrawal
 */
class Solution {
    public int reverse(int x) {
        long ans = 0;
        boolean isNegative = (x < 0) ? true : false;
        if(isNegative){
            x *= -1;
        }
        while(x > 0){
            int a = x % 10;
            ans = ans * 10 + a;
            x /= 10;
            if(ans > Integer.MAX_VALUE){
                return 0;
            }
        }
        if(isNegative){
            ans *= -1;
        }
        return (int) ans;
    }
}