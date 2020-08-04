/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number} num
 * @return {number}
 */
var addDigits = function(num) {
    return (num === 0) ? 0 : 1 + ((num - 1) % 9);
};
