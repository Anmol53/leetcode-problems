/**
 * @author : Anmol Agrawal
 */
class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        return binarySearch(nums, 0, nums.length - 1);
    }
    int binarySearch(int arr[], int l, int r){
        if (r >= l) {
            int mid = l + (r - l) / 2;
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
            int i = binarySearch(arr, l, mid - 1);
            return Math.min(binarySearch(arr, mid + 1, r),i);
        }
        return arr[0];
    }
}