/**
 * @author : Anmol Agrawal
 */
class Solution {
    public int maximalSquare(char[][] inputMatrix) {
        int maxSide = 0;
        int n = inputMatrix.length;
        if(n == 0){
            return 0;
        }
        int m = inputMatrix[0].length;
        if(m == 0){
            return 0;
        }
        int matrix[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(inputMatrix[i][j] == '1'){
                    if(i == 0 || j == 0){
                        matrix[i][j] = (int)(inputMatrix[i][j] - '0');
                        if(maxSide < 1){
                            maxSide = 1;
                        }
                    }
                    else {
                        int minA = Math.min(matrix[i - 1][j - 1], matrix[i - 1][j]);
                        int min = Math.min(minA, matrix[i][j - 1]);
                        matrix[i][j] = min + 1;
                        if(matrix[i][j] > maxSide){
                            maxSide = matrix[i][j];
                        }
                    }
                }
            }
        }
        return maxSide * maxSide;
    }
}
