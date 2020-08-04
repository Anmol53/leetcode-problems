/**
 * @author : Anmol Agrawal
 */
/**
 * @param {character[][]} board
 * @return {void} Do not return anything, modify board in-place instead.
 */
var solve = function(board) {
    if(board.length == 0) return;
    for(let i = 0; i < board.length; i++){
        border(board, i, 0);
        border(board, i, board[i].length - 1);
    }
    for(let j = 0; j < board[0].length; j++){
        border(board, 0, j);
        border(board, board.length - 1, j);
    }
    for(let i = 0; i < board.length; i++){
        for(let j = 0; j < board[i].length; j++){
            if(board[i][j] == 'O'){
                board[i][j] = 'X';
            }
            if(board[i][j] == 'S'){
                board[i][j] = 'O';
            }
        }
    }
};
var border = function(board, i, j){
    if(i < 0 || j < 0 || i >= board.length || j >= board[0].length){
        return;
    }
    if(board[i][j] == 'O'){
        board[i][j] = 'S';
        border(board, i - 1, j);
        border(board, i, j - 1);
        border(board, i, j + 1);
        border(board, i + 1, j);
    }
};