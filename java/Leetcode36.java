public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set set;
        for(int i=0;i<9;i++){
            set=new HashSet();
            for(int j=0;j<9;j++){
                if(set.contains(board[i][j])&&board[i][j]!='.'){
                    return false;
                }
                set.add(board[i][j]);
            }
        }//ÅÐ¶ÏÐÐ
        for(int i=0;i<9;i++){
            set=new HashSet();
            for(int j=0;j<9;j++){
                if(set.contains(board[j][i])&&board[j][i]!='.'){
                    return false;
                }
                set.add(board[j][i]);
            }
        }//ÅÐ¶ÏÁÐ
        
        for(int i=0;i<9;i++){
            set=new HashSet();
            for(int j=(3*(i/3));j<(3*(i/3))+3;j++){
                for(int k=(3*(i%3));k<(3*(i%3))+3;k++){
                    if(set.contains(board[j][k])&&board[j][k]!='.'){
                        return false;
                    }
                    set.add(board[j][k]);
                }
            }
        }
        return true;
    }
}