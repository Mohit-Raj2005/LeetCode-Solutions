class Solution {
    public int arraySign(int[] nums){
        //this is a more optimized solution to this problem
        int negcount = 0;  // intialising count for total number of -ve integers
        for(int i = 0; i < nums.length ; i++){   // iterating over the array
            if(nums[i]==0){
                return 0;   // if the array contains 0 then we will return 0
            }
            else if(nums[i]<0){   
                negcount++;    // increasing the negcount if the current iteration element i -ve
            }
            else{
                continue;  // skipping iteration for +ve elements
            }
        }
        if(negcount % 2 == 0 ){   // if it has even -ve integers the overall ans will be +ve thus returning 1
            return 1;
        }
        else{
            return -1;   //if it has odd -ve integers the overall ans will be -ve thus returning -1
        }
    }



    // this is another method but can be more optimised
    // public int arraySign(int[] nums) {
    //     int product = 1;
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]==0){
    //             continue;
    //         }
    //         else if(nums[i]<0){
    //             nums[i] = -1;
    //         }
    //         else{
    //             nums[i] = 1;
    //         }
    //     }
    //     for(int i =0; i<nums.length ; i++){
    //         product *= nums[i];
    //     }

    //     if(product<0){
    //         return -1;
    //     }
    //     if(product >0){
    //         return 1;
    //     }
    //     return 0;
    // }








    //this is one solution that is accepted 
    // public int signFunc(int x){
    //     int ans = -2;
    //     if(x<0){
    //         ans = -1;
    //     }
    //     else if(x>0){
    //         ans = 1;
    //     }
    //     else{
    //         ans = 0;
    //     }
    //     return ans;
    // }
    // public int arraySign(int[] nums) {
    //     int product = 1;
    //     for(int i =0 ; i<nums.length ; i++){
    //         if(nums[i]<0){
    //             nums[i] = -1;
    //         }
    //         if(nums[i]>0){
    //             nums[i] = 1;
    //         }
    //         else{
    //             continue;
    //         }
    //     }
    //     for(int i =0; i<nums.length; i++){
    //         product *= nums[i];
    //     }

    //     return signFunc(product);
        
    // }
}