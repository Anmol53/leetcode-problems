/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let a = nums[0];
    for(let i = 1; i < nums.length; i++){
        a = a ^ nums[i];
    }
    return a;
};