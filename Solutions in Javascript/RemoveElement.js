/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    let x = 0;
    for(let i = 0; i < nums.length - x; i++){
        if(nums[i] == val){
            x++;
            for(let j = i; j < nums.length - 1; j++){
                nums[j] = nums[j+1];
            }
            i--;
        }
    }
    return nums.length - x;
};