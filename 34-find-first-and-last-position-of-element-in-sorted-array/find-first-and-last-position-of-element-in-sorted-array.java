class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] RangeAns = new int[2];
        int start = 0;
        int end = nums.length - 1;
        int s = 0;
        int e = nums.length - 1;
        int startIndx = -1;
        int endIndx = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                startIndx = mid;
                end = mid - 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        while(s <= e){
            int mid = s +(e - s) / 2;
            if(nums[mid] == target){
                endIndx = mid;
                s = mid + 1;
            }
            else if(nums[mid] > target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        RangeAns[0] = startIndx;
        RangeAns[1] = endIndx;
        return RangeAns;
    }
}