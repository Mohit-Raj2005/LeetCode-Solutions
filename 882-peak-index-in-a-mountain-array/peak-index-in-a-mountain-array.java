class Solution {
    //METHOD 2
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                ans = mid;
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
    


    //METHOD 1
    // public int peakIndexInMountainArray(int[] arr) {
    // this solution is also accepted with runtime complexity of O(logn)
    // runtime 0ms beats 100% and beats 20.57% in memory
    //     int start = 0;
    //     int end = arr.length-1;
    //     int mid = start + (end - start)/2;
    //     while(start <= end && mid>=0){
            
    //         if(arr[mid] > arr[mid - 1]){
    //             if(arr[mid] > arr[mid+1]){
    //                 return mid;
    //             }
    //             else{
    //                 start = mid + 1;
    //             }
    //         }
    //         else{
    //             end = mid ;
    //         }
    //          mid = start + (end - start)/2;
    //     }
    //     return 0;
    // }
}