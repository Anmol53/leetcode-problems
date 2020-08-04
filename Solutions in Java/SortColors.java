/**
 * @author : Anmol Agrawal
 */
class Solution {
    public void sortColors(int[] nums) {
        int zeroPivot = -1;
        int onePivot = -1;
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            boolean is = false;
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
    }
}