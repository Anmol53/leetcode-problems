/**
 * @author : Anmol Agrawal
 */
class Solution {
    public void islanding(char[][] grid, int i, int j){
        grid[i][j] = '2';
        if(j > 0){
            if(grid[i][j - 1] == '1'){
                islanding(grid, i, j - 1);
            }
        }
        if(j < (grid[i].length - 1)){
            if(grid[i][j + 1] == '1'){
                islanding(grid, i, j + 1);
            }
        }
        if(i > 0){
            if(grid[i - 1][j] == '1'){
                islanding(grid, i - 1, j);
            }
        }
        if(i < (grid.length - 1)){
            if(grid[i + 1][j] == '1'){
                islanding(grid, i + 1, j);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            inner:
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    islanding(grid, i, j);
                }
            }
        }
        return count;
    }
}
