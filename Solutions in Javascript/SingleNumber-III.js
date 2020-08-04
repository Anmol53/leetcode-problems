/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var singleNumber = function(nums) {
    let xor = 0;
    for(let i = 0; i < nums.length; i++){
        xor ^= nums[i];
    }
    let s = xor.toString(2);
    let i = parseInt(s.substring(Math.max(s.lastIndexOf('1'), 0)), 2);
    let ans = [];
    ans[0] = 0;
    for(let j = 0; j < nums.length; j++){
        if((i & nums[j]) > 0){
            ans[0] ^= nums[j];
        }
    }
    ans[1] = ans[0] ^ xor;
    return ans;
};
