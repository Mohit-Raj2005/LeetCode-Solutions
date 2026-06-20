class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end - start)/2;
        while(start <= end && mid>=0){
            
            if(arr[mid] > arr[mid - 1]){
                if(arr[mid] > arr[mid+1]){
                    return mid;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                end = mid ;
            }
             mid = start + (end - start)/2;
        }
        return 0;
    }
}