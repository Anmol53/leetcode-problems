/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfTwo = function(n) {
    if(n <= 0){
        return false;
    }
    return (n & -n) === n;
};