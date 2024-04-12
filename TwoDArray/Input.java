package TwoDArray;
import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int mat [] [] = new int [nr] [nc];
        for(int i = 0 ; i < nr ; i++){
            for(int j = 0 ; j < nc ; j++){
                mat [i] [j] = scn.nextInt();
            }
        }
        for(int c = 0 ; c < nc ; c++){
            if(c % 2 == 0){
                for(int r = 0 ; r <=nr-1 ; r++){
                    System.out.println(mat[r][c]);
                }
            }
            else{
                for(int r = nr-1 ; r >= 0 ;r--){
                    System.out.println(mat[r][c]);
                }
            }
        }
    }
}
