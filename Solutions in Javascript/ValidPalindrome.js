/**
 * @author : Anmol Agrawal
 */
/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    s = s.toLowerCase();
    let i = 0;
    let j = s.length - 1;
    while(i < j){
        let a = s.charAt(i);
        let b = s.charAt(j);
        if(!((a >= '0' && a <= '9') || (a >= 'a' && a <= 'z'))){
            i++;
            continue;
        }
        if(!((b >= '0' && b <= '9') || (b >= 'a' && b <= 'z'))){
            j--;
            continue;
        }
        if(a != b){
            return false;
        }
        i++;
        j--;
    }
    return true;
};