package RecursionLeveltwo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Nqueenspermutations {
    public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] chess = new int[n][n];
    queenPermutation(0, n, chess);
    }
    public static int IsQueenSafe(int[][] chess , int row , int col){
        return 0;
        //hw
    }
    public static void queenPermutation(int qsf , int tq , int[][] chess){
        if(qsf == tq){
            for(int i = 0 ; i < chess.length ; i++){
                for(int j = 0 ; j < chess[0].length;j++){
                    if(chess[i][j]!=0){
                        System.out.print("q"+chess[i][j]+"\t");
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
        for(int cell = 0 ; cell < tq*tq ; cell++){
            int row = cell / chess.length;
            int col = cell % chess.length;
            if(chess[row][col]==0){
                chess[row][col] = qsf+1;
                queenPermutation(qsf+1, tq, chess);
                chess[row][col] = 0 ;
            }
        }
    }
}
