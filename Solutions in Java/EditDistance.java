/**
 * @author : Anmol Agrawal
 */
class Solution {
    public int minDistance(String word1, String word2) {
        int row = word2.length();
        int col = word1.length();
        if(row == 0 || col == 0){
            return Math.max(row, col);
        }
        int dp[][] = new int[row + 1][col + 1];
        for(int i = 0; i < dp[0].length; i++){
            dp[0][i] = i;
        }
        for(int i = 1; i < dp.length; i++){
            dp[i][0] = i;
        }
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(word2.charAt(i - 1) == word1.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else{
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                }
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}