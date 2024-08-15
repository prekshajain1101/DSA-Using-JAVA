package RecursionLeveltwo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Combinations {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int rboxes = Integer.parseInt(br.readLine());
        combinations(new int[nboxes], 1, rboxes, -1);
    }
    public static void combinations(int arr[] , int ci , int ti , int lb){
        if( ci > ti){
            for(int val : arr){
                System.out.print(val != 0 ? "i":"-");
            }
            System.out.println();
            return;
        }
        for(int i = lb+1 ; i < arr.length ; i++){
            arr[i] = 1;
            combinations(arr, ci+1, ti, i);
            arr[i] = 0;
        }
    }
}
