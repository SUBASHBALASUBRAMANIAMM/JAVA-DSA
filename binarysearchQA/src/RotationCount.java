public class RotationCount {
    //https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int pivot = findPivot(arr);
        //System.out.println(pivot);
        System.out.println("Number of rotations are " + (pivot + 1));
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
