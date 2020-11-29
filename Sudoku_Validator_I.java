//Normal Way
public class Solution{
    public int validateSudoku(char board[][]){
        if(board.length()==0 || board=''){
            return false;
        }
        HashSet<Character> rows = new HashSet<Character>();
        HashSet<Character> columns = new HashSet<Character>();
        HashSet<Character> subGrid = new HashSet<Character>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]!='.' && rows.contains(board[i][j])){
                    return false;
                }
                if(board[i][j]!='.' && columns.contains(board[i][j])){
                    return false;
                }       
                int rowIndex = 3*(i/3);
                int columnIndex = 3*(i%3);
                if(board[rowIndex + j/3][columnIndex + j%3]!='.'  && subGrid.contains(board[rowIndex + j/3][columnIndex + j%3]) )
                    return false;
                }
            }
        }
        return true;
    }
}
