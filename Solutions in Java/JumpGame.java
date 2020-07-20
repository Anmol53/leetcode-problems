/**
 * @author : Anmol Agrawal
 */
class Solution {
    public boolean canJump(int[] nums) {
        boolean isZeroCrossed = true;
        int a = 0;
        for(int i = nums.length - 2; i >= 0; i--){
            if(isZeroCrossed && nums[i] == 0){
                isZeroCrossed = false;
                a = 0;
            }
            if(!isZeroCrossed){
                if(a < nums[i]){
                    isZeroCrossed = true;
                }
                a++;
            }
        }
        return isZeroCrossed;
    }
}