package RecursionLeveltwo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Queenstwodasoned {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] chess = new boolean[n][n];
        queenComination(0, n, chess, -1);
    }
    public static void queenComination(int qsf , int tq , boolean[][] chess , int lcno){
        if(qsf == tq){
            for(int i = 0 ; i < chess.length ; i++){
                for(int j = 0 ; j < chess[0].length;j++){
                    if(chess[i][j]){
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
        for(int cell = lcno+1 ; cell < tq * tq ; cell++){
            int row = cell / tq;
            int col = cell % tq;
            chess[row][col] = true;
            queenComination(qsf+1, tq, chess, cell);
            chess[row][col] = false;
        }
    }
}
