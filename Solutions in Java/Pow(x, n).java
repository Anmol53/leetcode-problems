/**
* @author : Anmol Agrawal
*/
class Solution {
    public double myPow(double x, long n) {
        System.out.println(n);
        if(x == 0.0){
            return 0;
        }
        if(x == 1.0){
            return 1;
        }
        if(n == 0.0){
            return 1;
        }
        if(n == 1.0){
            return x;
        }
        if(n < 0.0){
            return 1 / myPow(x, -n);
        }
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}
