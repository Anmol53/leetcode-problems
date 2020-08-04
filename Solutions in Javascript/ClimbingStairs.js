/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    if(n <= 2){
        return n;
    }
    let arr = [];
    arr[0] = 1;
    arr[1] = 2;
    for(let i = 2; i < n; i++){
        arr[i] = arr[i - 1] + arr[i - 2];
    }
    return arr[n - 1];
};