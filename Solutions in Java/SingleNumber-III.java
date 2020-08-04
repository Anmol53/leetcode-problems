/**
 * @author : Anmol Agrawal
 */
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int x : nums){
            xor ^= x;
        }
        String s = Integer.toBinaryString(xor);
        int i = Integer.parseInt(s.substring(Math.max(s.lastIndexOf('1'), 0)), 2);
        int ans[] = new int[2];
        ans[0] = 0;
        for(int x : nums){
            if((i & x) > 0){
                ans[0] ^= x;
            }
        }
        ans[1] = ans[0] ^ xor;
        return ans;
    }
}
