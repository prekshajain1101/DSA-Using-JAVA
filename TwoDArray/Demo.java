package TwoDArray;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int mat [] [] = new int [nr] [nc];
        //input
        for(int i = 0 ; i < nr ; i++){
            for(int j = 0 ; j < nc ; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        //output
        for(int i = 0 ; i < nr ; i++){
            for(int j = 0 ; j < nc ; j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
