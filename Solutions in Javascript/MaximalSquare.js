/**
 * @author : Anmol Agrawal
 */
/**
 * @param {character[][]} matrix
 * @return {number}
 */
var maximalSquare = function(inputMatrix) {
    let maxSide = 0;
    let n = inputMatrix.length;
    if(n == 0){
        return 0;
    }
    let m = inputMatrix[0].length;
    if(m == 0){
        return 0;
    }
    let matrix = [];
    for(let i = 0; i < n; i++){
        matrix[i] = [];
    }
    for(let i = 0; i < n; i++){
        for(let j = 0; j < m; j++){
            if(inputMatrix[i][j] === '1'){
                if(i === 0 || j === 0){
                    matrix[i][j] = (inputMatrix[i][j].charCodeAt(0) - '0'.charCodeAt(0));
                    if(maxSide < 1){
                        maxSide = 1;
                    }
                }
                else {
                    let min = Math.min(Math.min(matrix[i - 1][j - 1], matrix[i - 1][j]), matrix[i][j - 1]);
                    matrix[i][j] = min + 1;
                    if(matrix[i][j] > maxSide){
                        maxSide = matrix[i][j];
                    }
                }
            }
            else{
                matrix[i][j] = 0;
            }
        }
    }
    return maxSide * maxSide;
};