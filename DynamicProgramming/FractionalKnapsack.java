package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class FractionalKnapsack {
    public static class Knapsack implements Comparable<Knapsack>{
        int wt , val;
        Double vwr;
        public int compareTo(Knapsack o) {
            if(o.vwr < this.vwr){
                return -1;
            }
            else if(o.vwr == this.vwr){
                return 0;
            }
            else{
                return 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int wts [] = new int[n];
        for(int i = 0 ; i < n ; i++){
            wts[i] = scn.nextInt();
        }
        int vls[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            vls[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        Knapsack items[] = new Knapsack[n];
        for(int i = 0 ; i < n ; i++){
            items[i] = new Knapsack();
            items[i].val = vls[i];
            items[i].wt = wts[i];
            items[i].vwr = (vls[i]*1.0)/wts[i];
        }
        Arrays.sort(items);
        int idx = 0 ; double tval = 0.0;
        while (idx < n && cap != 0) {
            if(items[idx].wt <= cap){
                cap -= items[idx].wt;
                tval += items[idx].val;
                idx++;
            }
            else{
                tval += cap * items[idx].vwr;
                cap = 0;
            }
        }
        System.out.println(tval);
    }
}
