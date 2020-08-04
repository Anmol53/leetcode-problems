/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    let temp = 1;
    let ans = [];
    for(let i = 0; i < nums.length; i++){
        ans[i] = temp;
        temp *= nums[i];
    }
    temp = 1;
    for(let i = nums.length - 1; i >= 0; i--){
        ans[i] *= temp;
        temp *= nums[i];
    }
    return ans;
};