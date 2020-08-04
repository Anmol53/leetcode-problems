/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number} n - a positive integer
 * @return {number} - a positive integer
 */
var reverseBits = function(n) {
    let s = n.toString(2);
    while(s.length < 32){
        s = "0" + s;
    }
    return parseInt(s.split('').reverse().join(''), 2);
};