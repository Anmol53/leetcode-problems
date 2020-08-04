/**
 * @author : Anmol Agrawal
 */
class Solution {
    public boolean isHappy(int n) {
        while(true){
            int a = 0;
            while(n > 0){
                a += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = a;
            if(n % 10 == n){
                break;
            }
        }
        return (n == 1 || n == 7) ? true : false;
    }
}