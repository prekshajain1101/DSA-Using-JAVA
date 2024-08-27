package RecursionLeveltwo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Nqueens {
        public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] chess = new boolean[n][n];

    }
    public static boolean IsQueenSafe(boolean[][] chess,int row , int col){
        for(int i = row-1 , j = col ; i >= 0 ;i-- ){
            if(chess[i][j] == true){
                return false;
            }
        }
        for(int i = row , j = col-1 ; j >= 0 ; j--){
            if(chess[i][j] == true){
                return false;
            }
        }
        for(int i = row-1 , j = col-1 ;i>=0 && j >= 0 ;i--, j--){
            if(chess[i][j] == true){
                return false;
            }
        }
        for(int i = row-1 , j = col+1 ;i>=0 && j < chess[0].length ;i--, j++){
            if(chess[i][j] == true){
                return false;
            }
        }
        return true;
    }
    public static void queenComination(int qsf , int tq , boolean[][] chess , int lcno){
        if(qsf == tq){
            for(int row = 0 ; row < chess.length ; row++){
                for(int col = 0 ; col < chess[0].length;col++){
                    if(chess[row][col]){
                        System.out.print("q\t");
                    }
                    else{
                        System.out.print("-\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int cell = lcno+1 ; cell < chess.length * chess.length ; cell++){
            int row = cell / chess.length;
            int col = cell % chess.length;
            if(IsQueenSafe(chess, row, col)){
                chess[row][col] = true;
                queenComination(qsf+1, tq, chess, row*chess.length+1);
                chess[row][col] = false;
            }
        }
    }
}
