public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int tar = 3;
        int peak = peak(arr);
        int firstTry = oabs(arr,tar,0,peak);
        if(firstTry!=-1){
            System.out.println(firstTry);
        }
        System.out.println(oabs(arr,tar,peak+1,arr.length-1));

    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <end){
            int mid = start + (end -start)/2;
            if(arr[mid]>arr[mid+1]){
                end =mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    static int oabs(int[]arr,int tar,int start,int end){

        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==tar){
                return mid;
            }
        if(isAsc){
            if(arr[mid] > tar){
                end = mid-1;
            }else  {
                start = mid+1;
            }
        }else{
            if(arr[mid] < tar){
                end = mid-1;
            }else  {
                start = mid+1;
            }

        }
        }
        return -1;
    }
}
