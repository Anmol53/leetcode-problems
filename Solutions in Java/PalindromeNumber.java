/**
 * @author : Anmol Agrawal
 */
class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int reverse = 0;
        if(x < 0){
            return false;
        }
        while(x > 0){
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }
        return (y == reverse) ? true : false;
    }
}
