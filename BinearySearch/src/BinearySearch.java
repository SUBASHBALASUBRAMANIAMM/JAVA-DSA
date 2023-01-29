public class BinearySearch {
    public static void main(String[] args) {
        int[] arr = {18, 12, 5, 67};
        int tar = 12;
        int ans = bs(arr, tar);
        System.out.println(ans);

    }

    static int bs(int[] arr, int tar) {
        int start = 0;
        int end = arr.length - 1;

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
}