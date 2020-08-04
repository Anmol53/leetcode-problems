/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number[]} nums
 * @return {number}
 */
var findMin = function(nums) {
    if(nums.length == 1) return nums[0];
    return binarySearch(nums, 0, nums.length - 1);
};
var binarySearch = function(arr, l, r){
    if (r >= l) {
        let mid = l + Math.floor((r - l) / 2);
        if (mid != 0){
            if(arr[mid] < arr[mid - 1]){
                return arr[mid];
            }
        }
        else{
            if(arr[0] < arr[arr.length - 1]){
                return arr[0];
            }
        }
        let i = binarySearch(arr, l, mid - 1);
        return Math.min(binarySearch(arr, mid + 1, r), i);
    }
    return arr[0];
};