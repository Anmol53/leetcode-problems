/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
    while(true){
        let a = 0;
        while(n > 0){
            a += Math.pow(n % 10, 2);
            n = Math.floor(n / 10);
        }
        n = a;
        if(n % 10 == n){
            break;
        }
    }
    return (n == 1 || n == 7) ? true : false;
};