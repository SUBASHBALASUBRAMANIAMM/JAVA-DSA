public class orderAgnosticBs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int tar = 5;
        System.out.println(Oabs(arr,tar));
    }

    static int Oabs(int[] arr,int tar) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == tar){
                return mid;
            }
            if(isAsc){
                if (tar < arr[mid]) {
                    end = mid - 1;
                } else if (tar > arr[mid]) {
                    start = mid + 1;
                }
            }else {
                if (tar > arr[mid]) {
                    end = mid - 1;
                } else if (tar < arr[mid]) {
                    start = mid + 1;
                }
            }


        }
        return -1;




    }
}

