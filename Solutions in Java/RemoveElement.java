/**
 * @author : Anmol Agrawal
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int x = 0;
        for(int i = 0; i < nums.length - x; i++){
            if(nums[i] == val){
                x++;
                for(int j = i; j < nums.length - 1; j++){
                    nums[j] = nums[j+1];
                }
                i--;
            }
        }
        return nums.length - x;        
    }
}