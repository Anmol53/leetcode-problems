/**
 * @author : Anmol Agrawal
 */
class Solution {
    Map<Integer, ArrayList<Integer>> mpOfList = new HashMap<>();
    Set<Integer> hs = new HashSet<>();
    public boolean canFinish(int n, int[][] prerequisites) {
        mpOfList.clear();
        for(int x[] : prerequisites){
            if(mpOfList.containsKey(x[0])){
                ArrayList<Integer> al = mpOfList.get(x[0]);
                al.add(x[1]);
                mpOfList.put(x[0], al);
            }
            else{
                ArrayList<Integer> al = new ArrayList<>();
                al.add(x[1]);
                mpOfList.put(x[0], al);                
            }
        }
        while(mpOfList.size() > 0){
            hs.clear();
            int start = -1;
            for(Map.Entry<Integer, ArrayList<Integer>> entry : mpOfList.entrySet()){
                start = entry.getKey();
                if(true){
                    break;
                }
            }
            hs.add(start);
            boolean is = isCycle(start);
            if(is){
                return false;
            }
        }
        return true;
    }
    boolean isCycle(int a){
        if(!mpOfList.containsKey(a)){
            return false;
        }
        for(Integer x : mpOfList.get(a)){
            if(hs.contains(x)){
                return true;
            }
            hs.add(x);
            boolean is = isCycle(x);
            if(is){
                return true;
            }
            hs.remove(x);
        }
        mpOfList.remove(a);
        return false;
    }
}