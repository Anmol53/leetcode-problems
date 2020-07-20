class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++){
			int sec = target - nums[i];
			if(hm.containsKey(sec)){
                return new int[]{hm.get(sec), i};
            }
			hm.put(nums[i], i);
		}
		return null;
    }
}