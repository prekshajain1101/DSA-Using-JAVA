package Array;

public class CeilandFloor {
    public static void main(String[] args) {
        int arr[] = {1,5,10,15,22,33,40,42,55,66};
        int k = 34;
        Ceil(arr, k);
    }
    public static void Ceil(int arr[] , int k){
        int ceil = -1 , floor = -1;
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == k){
                ceil = floor = arr[mid];
                break;
            }
            else if ( k < arr[mid]){
                hi = mid -1;
                ceil = arr[mid];
            }
            else{
                lo = mid+1;
                floor = arr[mid];
            }
        }
        System.out.println(ceil+"\n"+floor);
    }
}
