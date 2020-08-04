/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    k %= nums.length;
    swap(nums, 0, nums.length - 1);
    swap(nums, 0, k - 1);
    swap(nums, k, nums.length - 1);
};
var swap = function(nums, l, r){
    while(l < r){
        let temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
        l++;
        r--;
    }
};