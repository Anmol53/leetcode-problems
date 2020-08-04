/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    var carry = 1;
    for(var i = digits.length - 1; i >= 0; i--){
        var a = digits[i] + carry;
        digits[i] = a % 10;
        carry = a / 10;
        carry = Math.floor(carry);
        if(carry === 0){
            break;
        }
    }
    if(carry > 0){
        digits.unshift(carry);
    }
    return digits;
};