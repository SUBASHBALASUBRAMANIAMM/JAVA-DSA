import java.awt.image.BufferedImage;

public class InfiniteArray {
    //https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int tar = 10;
        System.out.println(ans(arr,tar));
    }
    static int ans (int[]arr,int tar){
        int start = 0;
        int end = 1;
        while(arr[end]< tar){
            int temp = end +1;
            end= end + (end - start+1)*2;
            start = temp;

        }

        return BinarySearch(arr,tar,start,end);
    }
    static int BinarySearch(int[] arr,int tar, int start,int end){
        while(start<=end){
            //int mid = (start + end)/2
            int mid = start + (end - start)/2;
            if(tar>arr[mid]){
                start = mid +1;
            } else if (tar < arr[mid]) {
                end = mid-1;
            }else{
                return mid;
            }

        }
        return  -1;
    }
}
