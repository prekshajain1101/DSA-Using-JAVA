package TwoDArray;
import java.util.*;
public class RotatebyNinty {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat [] [] = new int [n] [n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        Transpose(mat);
        reverse(mat);
        displayArray(mat);
    }
    public static void Transpose(int mat[][]){
        int n = mat.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    public static void reverse(int mat[][]){
        int n = mat.length;
        for(int r = 0 ; r < n ; r++){
            int lo = 0 , hi = n-1;
            while(lo < hi){
                int temp = mat[r][lo];
                mat[r][lo] = mat[r][hi];
                mat[r][hi] = temp;
                lo++;
                hi--;
            }
        }
    }
    public static void displayArray(int mat[][]){
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
