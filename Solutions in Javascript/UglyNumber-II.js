/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number} n
 * @return {number}
 */
var nthUglyNumber = function(n) {
    let uglys  = [];
    uglys.push(1);
    let i2 = 0;
    let i3 = 0;
    let i5 = 0;
    while(uglys.length < n){
        let next = Math.min(Math.min(uglys[i2] * 2, uglys[i3] * 3), uglys[i5] * 5);
        if(next === uglys[i2] * 2){
            i2++;
        }
        if(next === uglys[i3] * 3){
            i3++;
        }
        if(next === uglys[i5] * 5){
            i5++;
        }
        uglys.push(next);
    }
    return uglys[n - 1];
};
