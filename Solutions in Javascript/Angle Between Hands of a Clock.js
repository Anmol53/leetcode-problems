/**
* @author : Anmol Agrawal
*/
/**
 * @param {number} hour
 * @param {number} minutes
 * @return {number}
 */
var angleClock = function(hour, minutes) {
    let a = Math.abs(30 * hour - (11 * minutes) / 2);
    return Math.min(a, 360 - a);
};
