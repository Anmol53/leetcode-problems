/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let occur1 = 0, occur2 = 0 ;
    let n = nums.length;
    let common; 
    for(let i = 0; i < n; i++){
        occur2 = occur2 | (occur1 & nums[i]);
        occur1 = occur1 ^ nums[i];
        common = ~(occur1 & occur2);
        occur1 &= common;
        occur2 &= common;
    }
    return occur1;
};