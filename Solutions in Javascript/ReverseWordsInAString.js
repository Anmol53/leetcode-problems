/**
 * @author : Anmol Agrawal
 */
/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    let strs = s.trim().split(" ");
    let o = "";
    for(let i = strs.length - 1; i >= 0; i--){
        let x = strs[i];
        if(x.length > 0){
            o = o + x + " ";
        }
    }
    return o.trim();
};