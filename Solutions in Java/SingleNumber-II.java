/**
 * @author : Anmol Agrawal
 */
class Solution {
    public int singleNumber(int[] nums) {
        int occur1 = 0, occur2 = 0 ;
        int n = nums.length;
        int common; 
        for(int i = 0; i < n; i++){
            occur2 = occur2 | (occur1 & nums[i]);
            occur1 = occur1 ^ nums[i];
            common = ~(occur1 & occur2);
            occur1 &= common;
            occur2 &= common;
        }
        return occur1;
    }
}