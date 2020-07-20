/**
 * @author : Anmol Agrawal
 */
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    if(nums.length === 0){
        return 0;
    }
    return bin(nums, target, 0, nums.length - 1);
};

function bin(arr, s, l, r){
    if(r === l){
        if(arr[l] >= s) return l;
        return l + 1;
    }
    const m = Math.floor((r - l) / 2) + l;
    if(arr[m] === s) return m;
    if(m === 0){
        if(arr[m] > s) return m;
        return bin(arr, s, m + 1, r);
    }
    if(m === arr.length - 1){
        if(arr[m] < s) return m + 1;
        return bin(arr, s, l, m - 1);
    }
    if(arr[m - 1] < s && arr[m] > s) return m;
    if(arr[m] < s && arr[m + 1] >= s) return m + 1;
    if(arr[m] < s) return bin(arr, s, m + 1, r);
    return bin(arr, s, l, m - 1);
}