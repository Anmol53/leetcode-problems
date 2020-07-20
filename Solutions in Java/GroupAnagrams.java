/**
 * @author : Anmol Agrawal
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<List<String>>();
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        int i = 0;
        for(String x : strs){
            char temp[] = x.toCharArray();
            Arrays.sort(temp);
            String  y = new String(temp);
            Integer index = hm.get(y);
            if(index == null){
                hm.put(y, i);
                i++;
                List<String> a = new ArrayList<String>();
                a.add(x);
                ans.add(a);
            }
            else{
                List<String> a = ans.get(index);
                a.add(x);
                ans.set(hm.get(y), a);
            }
        }
        return ans;
    }
}