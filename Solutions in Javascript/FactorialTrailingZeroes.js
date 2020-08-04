/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number} n
 * @return {number}
 */
var trailingZeroes = function(n) {
    var ans = 0;
    var fivePower = 5;
    while(Math.floor(n / fivePower) > 0){
        ans += Math.floor(n / fivePower); 
        fivePower *= 5;
    }
    return ans;
};