package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,30,45,62,78,84,89,100,150,180,192,300};
        int x = 150;
        int res = binarySearch(arr, x);
        System.out.println(res);
    }
    public static int binarySearch(int arr[] , int x){
        int lo = 0;
        int hi = arr.length-1 ;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if( x < arr[mid]){
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        return -1;

    }
}
