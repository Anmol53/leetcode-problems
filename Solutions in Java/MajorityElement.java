/**
 * @author : Anmol Agrawal
 */
class Solution {
    public int majorityElement(int[] nums) {
        int m = nums.length / 2;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int x : nums){
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() > m) return entry.getKey();
        }
        return 0;
    }
}