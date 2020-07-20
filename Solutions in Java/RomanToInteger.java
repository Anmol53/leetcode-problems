/**
 * @author : Anmol Agrawal
 */
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        int ans = 0;
        int previous = 0;
        for(int i = 0; i < s.length(); i++){
            int value = hm.get(s.charAt(i));
            ans += value;
            if(previous < value){
                ans -= previous;
                ans -= previous;
            }
            previous = value;
        }
        return ans;
    }
}
