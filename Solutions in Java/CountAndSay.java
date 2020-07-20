/**
 * @author : Anmol Agrawal
 */
class Solution {
    public String countAndSay(int n) {
        String ans = "";
        String previousAns = "1";
        for(int i = 1; i <= n; i++){
            if(i == 1){
                ans = previousAns;
            }
            else{
                ans = "";
                char c = previousAns.charAt(0);
                int occur = 1;
                for(int j = 1; j < previousAns.length(); j++){
                    if(previousAns.charAt(j) != c){
                        String first = Integer.toString(occur);
                        String second = String.valueOf(c);
                        ans += first + second;
                        c = previousAns.charAt(j);
                        occur = 1;
                    }
                    else{
                        occur++;
                    }
                }
            }
            previousAns = ans + "x";
        }
        return ans;
    }
}