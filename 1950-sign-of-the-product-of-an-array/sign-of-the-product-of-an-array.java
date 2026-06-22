class Solution {
    public int arraySign(int[] nums){
        int negcount = 0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i]==0){
                return 0;
            }
            else if(nums[i]<0){
                negcount++;
            }
            else{
                continue;
            }
        }
        if(negcount % 2 == 0 ){
            return 1;
        }
        else{
            return -1;
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