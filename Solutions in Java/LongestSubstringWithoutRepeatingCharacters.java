/**
 * @author : Anmol Agrawal
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for(int i = 0; i < s.length() - max; i++){
            HashMap<Character, Integer> hm = new HashMap<>();
            for(int j = i; j < s.length(); j++){
                if(hm.get(s.charAt(j)) != null){
                    i = s.indexOf(s.charAt(j), i);
                    break;
                }
                else{
                    hm.put(s.charAt(j), 1);
                }
            }
            if(hm.size() > max){
                max = hm.size();
            }
        }
        return max;
    }
}
