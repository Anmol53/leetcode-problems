/**
 * @author : Anmol Agrawal
 */
/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    let map = new Map();
    map.set('I', 1);
    map.set('V', 5);
    map.set('X', 10);
    map.set('L', 50);
    map.set('C', 100);
    map.set('D', 500);
    map.set('M', 1000);
    let ans = 0;
    let previous = 0;
    for(let i = 0; i < s.length; i++){
        let value = map.get(s.charAt(i));
        ans += value;
        if(previous < value){
            ans -= previous;
            ans -= previous;
        }
        previous = value;
    }
    return ans;
};