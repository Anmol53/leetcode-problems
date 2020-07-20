/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let ans = 0;
    let isNegative = (x < 0) ? true : false;
    if(isNegative){
        x *= -1;
    }
    while(x > 0){
        let a = x % 10;
        ans = ans * 10 + a;
        x = Math.floor(x/10);
        if(ans > Number.MAX_VALUE){
            return 0;
        }
    }
    if(isNegative){
        ans *= -1;
    }
    if(ans >= Math.pow(2,31) || ans < Math.pow(-2,31)){
        ans = 0;
    }
    return ans;
};