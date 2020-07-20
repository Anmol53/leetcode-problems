/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map = new Map();
    for(let i = 0; i < nums.length; i++){
        let sec = target - nums[i];
        if(map.has(sec)){
            let ans = [];
            ans[0] = map.get(sec);
            ans[1] = i;
            return ans;
        }
        map.set(nums[i], i);
    }
    return null;
};