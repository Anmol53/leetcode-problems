/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number[]} nums
 * @return {number}
 */
max = 0;
maxKey = 0;
var majorityElement = function(nums) {
    max = 0;
    maxKey = 0;
    let map = new Map()
    for(let i = 0; i < nums.length; i++){
        if (map.has(nums[i])) {
            map.set(nums[i], map.get(nums[i]) + 1);
        }
        else {
            map.set(nums[i], 1);
        }
    }
    map.forEach(logMapElements);
    return maxKey;
};
function logMapElements(value, key, map) {
    if(value > max){
        max = value;
        maxKey = key;
    }
}
