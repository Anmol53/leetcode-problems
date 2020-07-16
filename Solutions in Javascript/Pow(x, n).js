/**
* @author : Anmol Agrawal
*/
/**
 * @param {number} x
 * @param {number} n
 * @return {number}
 */
var myPow = function(x, n) {
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
    return (n % 2 == 0) ? myPow(x * x, Math.floor(n / 2)) : x * myPow(x * x, Math.floor(n / 2));
};
