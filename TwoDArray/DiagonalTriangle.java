package TwoDArray;
import java.util.*;
public class DiagonalTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        for(int gap = 0 ; gap < n; gap++){
            for( int r = 0 , c= gap ; r < n && c < n ; r++ , c++){
                System.out.println(mat[r][c]);
            }
        }
    }

}
