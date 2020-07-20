/**
 * @author : Anmol Agrawal
 */
/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    if(strs.length == 0){
        return "";
    }
    let prefix = strs[0];
    A : for(let i = 1; i < strs.length; i++){
        while(!strs[i].startsWith(prefix)){
            prefix = prefix.substring(0, prefix.length -1);
            if(prefix === ""){
                break A;
            }
        }
    }
    return prefix;
};