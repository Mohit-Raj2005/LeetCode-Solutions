class Solution {
    
    public int maximumCount(int[] nums) {
        int n =  nums.length;
        int start = 0;
        int end = n-1;
        int end2 = n-1;
        int posIndx=nums.length;
        int negIndx=-1;
        int newStart = 0;
       // int zeroCount = 0;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]<0){
                negIndx = mid ;
                start = mid + 1;   
            }
            // else if(nums[mid]>0){
            //     posIndx = mid;
            //     end = mid - 1;
            // }
            else{
                newStart = mid;
                end = mid -1;
            }
                
        
        }
        while(newStart <= end2){
            int mid = newStart + (end2 - newStart)/2;
            if(nums[mid]==0){
                newStart = mid + 1;
            }
            else{
                posIndx = mid;
                end2 = mid -1;
            }
        }
        int finalans = Math.max(negIndx+1,n-posIndx);
        return finalans;
        
    }
}