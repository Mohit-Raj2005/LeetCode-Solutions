class Solution {
    static boolean isValid(int[] nums, int k, int maxlength){
        int sum = 0;
        int splitcount = 1;
        for(int i = 0; i< nums.length; i++){
            if(sum + nums[i] <= maxlength){
                sum += nums[i];
            }
            else{
                splitcount++;
                if( splitcount > k || nums[i] > maxlength ){
                    return false;
                }
                else{
                    sum = 0;
                    sum += nums[i];
                }
            }

        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int maxcost = 0;
        for(int i = 0; i<nums.length; i++){
            maxcost += nums[i];
        }
        int start = 0;
        int end = maxcost;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(isValid(nums , k , mid)){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}