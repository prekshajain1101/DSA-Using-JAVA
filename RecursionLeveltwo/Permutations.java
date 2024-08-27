package RecursionLeveltwo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Permutations {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int rboxes = Integer.parseInt(br.readLine());
        permutation(1, nboxes, new int[rboxes], 0, rboxes, "");
    }
    public static void permutation(int cb , int tb , int[] arr , int ssf , int ts , String asf){
        if(cb > tb){
            if(ssf == ts){
                System.out.println(asf);
            }
            return;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                arr[i] = 1;
                permutation(cb+1, tb, arr, ssf+1, ts, asf+(i+1));
                arr[i] = 0;
            }
        }
        permutation(cb+1, tb, arr, ssf, ts, asf+"0");
    }
}
