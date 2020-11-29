public class Solution{
    public boolean isValidSudoku(char board[][]){
        if(board.length()==0 || board==''){
            return false;
        }   
        HashSet<String> set = new HashSet<String>();
        for(int i=0; i<9;i++){
            for(int j=0; j<9; j++){
                char currentCharacter = board[i][j];
                if(!set.add(currentCharacter + "found in row" + i)   
                        ||
                    set.add(currentCharacter + "found in column" + j) 
                        ||
                    set.add(currentCharacter + "found in subgrid" + i/3 + "-" + j/3)){
                    return false;
                }
            }
        }
        return true;
    }
}
