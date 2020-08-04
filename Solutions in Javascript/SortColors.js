/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
    let zeroPivot = -1;
    let onePivot = -1;
    let temp = 0;
    for(let i = 0; i < nums.length; i++){
        let is = false;
        if(nums[i] == 0){
            is = true;
            zeroPivot++;
            onePivot++;
            temp = nums[i];
            nums[i] = nums[zeroPivot];
            nums[zeroPivot] = temp;
        }
        if(nums[i] == 1){
            if(!is)
                onePivot++;
            temp = nums[i];
            nums[i] = nums[onePivot];
            nums[onePivot] = temp;
        }
    }
};