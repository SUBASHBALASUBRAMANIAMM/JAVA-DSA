public class SearchInRotatedSortedArray {
    //https://leetcode.com/problems/search-in-rotated-sorted-array/description/
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int tar = 7;
       int ans = search(arr,tar);
        System.out.println(ans);

    }
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1){
            //if pivot is -1,then do normal binary search because array is not rotated
            return binarySearch(nums,target,0,nums.length-1);
        }
//        int firstTry = binarySearch( nums, target,0,pivot);
//        if(firstTry!=-1){
//            return firstTry;
//        }
//        return binarySearch(nums,target,pivot+1, nums.length-1);
        // other method is
        if(nums[pivot]==target){
            return pivot;
        }
        if(nums[0]>target){
            //(num[0]-> start)
            // if start itself a bigger than target then the other number
            // comes after start till pivot will be definitely a bigger number
            // so we can check after pivot till end

            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
        //otherwise (if loop doesn't run then) target will be greater than start
        // then obviously it will be b/w start and pivot as because after pivot all elements will be smaller than start
        // and so we cant find a bigger number then start in range pivot+1 to end
        return binarySearch(nums,target,0,pivot);
    }

    static int binarySearch(int[]arr,int tar,int start,int end){

        while(start <=end){
            int mid = start + (end -start)/2;
            if(arr[mid] > tar){
                end = mid-1;
            }else if(arr[mid]<tar){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }


        static int findPivot(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]< arr[mid-1]){
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
