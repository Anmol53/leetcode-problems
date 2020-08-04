/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    let hs = new Set();
    for(let i = 0; i < nums.length; i++){
        if(hs.has(nums[i])){
            return true;
        }
        hs.add(nums[i]);
    }
    return false;
};