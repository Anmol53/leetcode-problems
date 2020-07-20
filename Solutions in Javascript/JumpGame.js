/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canJump = function(nums) {
    let isZeroCrossed = true;
    let a = 0;
    for(let i = nums.length - 2; i >= 0; i--){
        if(isZeroCrossed && nums[i] == 0){
            isZeroCrossed = false;
            a = 0;
        }
        if(!isZeroCrossed){
            if(a < nums[i]){
                isZeroCrossed = true;
            }
            a++;
        }
    }
    return isZeroCrossed;
};