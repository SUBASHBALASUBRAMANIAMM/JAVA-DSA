public class demobs {
    public static void main(String[] args) {
        int arr[] = {56,32,21,1};
        int tar = 21;
        System.out.println(m(arr,tar));
    }
     static  int m(int[] arr, int tar){
        int start = 0;
        int end = arr.length - 1;
        boolean isAs = arr[start] < arr[end] ;
        if(isAs){
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (tar < arr[mid]) {
                    end = mid - 1;
                } else if (tar > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }

            }
            return -1;

        }
        else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (tar > arr[mid]) {
                    end = mid - 1;
                } else if (tar < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }

            }
            return -1;

        }
     }
}
