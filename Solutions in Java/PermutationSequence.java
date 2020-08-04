/**
 * @author : Anmol Agrawal
 */
class Solution {
    public String getPermutation(int n, int k) {
        float fact[] = new float[n + 1];
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
            fact[i] = i == 1 ? 1.0f : i * fact[i - 1];
        }
        String ans = "";
        while(k > 1){
            float a = k / fact[n-1];
            k = k % (int)fact[n-1];
            n--;
            int intA = (int)a;
            if(a == (float)Math.floor(a)){
                intA--;
                ans = ans + Integer.toString(nums.get(intA));
                nums.remove(intA);
                for(int i = nums.size() - 1; i >= 0; i--){
                    ans = ans + Integer.toString(nums.get(i));
                }
                nums.clear();
                break;
            }
            ans = ans + Integer.toString(nums.get(intA));
            nums.remove(intA);
        }
        for(int i = 0; i < nums.size(); i++){
            ans = ans + Integer.toString(nums.get(i));
        }
        return ans;
    }
}