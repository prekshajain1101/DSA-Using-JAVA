package RecursionLeveltwo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Boxes {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int rboxes = Integer.parseInt(br.readLine());
        permutations(new int[nboxes], 1, rboxes);
    }
    public static void permutations(int arr[] , int ci , int ti){
        if(ci > ti){
            for(int val : arr){
                System.out.println(val);
            }
            System.out.println();
            return;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                arr[i] = ci;
            permutations(arr, ci+1, ti);
            arr[i] = 0;
            }
        }
    }
}
