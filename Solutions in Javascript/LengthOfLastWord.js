/**
 * @author : Anmol Agrawal
 */
/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    var sp = s.trim().split(" ");
    return sp[sp.length - 1].length;
};