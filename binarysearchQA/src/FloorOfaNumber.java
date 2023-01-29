public class FloorOfaNumber {
    //find the floor of a number , floor means ->(the output should be smaller than or equal to the target given )
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int tar = 17;
        int ceil = binarySearch(arr,tar);
        if(ceil != -1)System.out.println(arr[ceil]);
        else System.out.println("no floor ");
    }
    static int binarySearch(int[] arr,int tar){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end)/2;
            if(tar<arr[mid]){
                end = mid-1;
            }else if(tar > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return end;
    }
}
