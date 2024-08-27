package RecursionLeveltwo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class queenscombinations {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] queens = new boolean[n];
        queensCombinations(0 , n , 0 , 0 ,"");
    }
    public static void queensCombinations(int qpsf , int tq , int row , int col , String asf ){
        if(row == tq){
            if(qpsf == tq){
                System.out.println(asf);
            }
            return;
        }
        int nr , nc;
        String sep = "";
        if(col < tq-1){
            nr = row;
            nc = col+1;
            sep = "\t";
        }
        else{
            nr = row + 1;
            nc = 0;
            sep = "\n";
        }
        queensCombinations(qpsf+1, tq, nr, nc, asf+"q"+sep);
        queensCombinations(qpsf, tq, nr, nc, asf+"-"+sep);
    }
}
