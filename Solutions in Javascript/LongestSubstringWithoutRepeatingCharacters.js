/**
 * @author : Anmol Agrawal
 */
/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let max = 0;
    for(let i = 0; i < s.length - max; i++){
        let map = new Map();
        for(let j = i; j < s.length; j++){
            if(map.get(s.charAt(j)) != null){
                i = s.indexOf(s.charAt(j), i);
                break;
            }
            else{
                map.set(s.charAt(j), 1);
            }
        }
        if(map.size > max){
            max = map.size;
        }
    }
    return max;
};