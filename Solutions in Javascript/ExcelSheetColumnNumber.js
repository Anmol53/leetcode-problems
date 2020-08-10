/**
 * @author : Anmol Agrawal
 */
/**
 * @param {string} s
 * @return {number}
 */
var titleToNumber = function(s) {
    let e = 1;
    let ans = 0;
    for(let i = s.length - 1; i >= 0; i--){
        ans += e * (s.charCodeAt(i) - 'A'.charCodeAt(0) + 1);
        e *= 26;
    }
    return ans;
};
