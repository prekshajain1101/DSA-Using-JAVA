package RecursionLeveltwo;

import java.util.ArrayList;
import java.util.Scanner;

public class Tugofwar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr[] = new int[scn.nextInt()];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        solve(arr, 0, new ArrayList<>() , new ArrayList<>() , 0 , 0);
        System.out.println(ans);
    }
    static int mindiff = Integer.MAX_VALUE;
    static String ans = "";
    public static void solve(int arr[] , int vidx , ArrayList<Integer> set1 , ArrayList<Integer> set2 , int soset1 , int soset2){
        if(vidx == arr.length){
            int diff = Math.abs(soset1 + soset2);
            if(diff < mindiff){
                mindiff = diff;
                ans = set1 + " "+set2;
            }
            return;
        }
        int n = arr.length;
        int limit1 , limit2;
        if(n%2 == 0){
            limit1 = n/2;
            limit2 = n/2;
        }
        else{
            limit1 = (n+1)/2;
            limit2 = (n-1)/2;
        }
        if(set1.size() < limit1){
            set1.add(arr[vidx]);
            solve(arr, vidx+1, set1, set2, soset1+arr[vidx], soset2);
            set1.remove(set1.size()-1);
        }
        if(set2.size() < limit2){
            set2.add(arr[vidx]);
            solve(arr, vidx+1, set1, set2, soset1, soset2+1);
            set2.remove(set2.size()-1);
        }
    }
}
