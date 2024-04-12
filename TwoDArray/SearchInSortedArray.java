package TwoDArray;
import java.util.*;
public class SearchInSortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int [n][n];
        for(int idx = 0 ; idx < n ; idx++){
            for(int j = 0 ; j < n ; j++){
                mat[idx][j] = scn.nextInt();
            }
        }
        int x = scn.nextInt();
        int idx = 0 , j = n-1;
        while(j >= 0 && idx < n){
            if(mat[idx][j]==x){
                System.out.println(idx);
                System.out.println(j);
                return;
            }
            else if( x < mat [idx] [j]){
                j--;
            }
            else{
                idx++;
            }
        }
        System.out.println("Not Found");
    }
}
