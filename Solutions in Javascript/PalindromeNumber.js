/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let y = x;
    let reverse = 0;
    if(x < 0){
        return false;
    }
    while(x > 0){
        reverse = (reverse * 10) + (x % 10);
        x = Math.floor(x/10);
    }
    return (y === reverse) ? true : false;
};