import java.util.*;
public class NQueen {

    static List<List<String>> list = new ArrayList<>();
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(nQueen(board, 0));
        System.out.println(list);
    }  
    
    public static void display(boolean[][] board){
        
        List<String> temp = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String str = "";
            for(int j=0;j<board.length;j++){
                if(board[i][j]){
                    str += "Q ";
                }
                else{
                    str+=".";
                }
            }
           
            // str+=",";
            temp.add(str);
           
            System.out.println(str);
        }
        // temp.add(str);
        list.add(temp);
    }

    public static boolean isSafe(boolean[][] board,int row,int col){

        for(int i=0;i<row;i++){
            if(board[i][col]==true) return false;
        }
        int maxLeft = Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]) return false;
        }
        int maxRight = Math.min(row,board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]) return false;
        }

        return true;
    }

    public static int nQueen(boolean[][] board,int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += nQueen(board,row+1);
                board[row][col] = false;
            }
            
        }

        return count;
    }
}
