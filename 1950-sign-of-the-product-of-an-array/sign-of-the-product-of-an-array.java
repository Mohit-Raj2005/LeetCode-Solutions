class Solution {
    public int signFunc(int x){
        int ans = -2;
        if(x<0){
            ans = -1;
        }
        else if(x>0){
            ans = 1;
        }
        else{
            ans = 0;
        }
        return ans;
    }
    public int arraySign(int[] nums) {
        int product = 1;
        for(int i =0 ; i<nums.length ; i++){
            if(nums[i]<0){
                nums[i] = -1;
            }
            if(nums[i]>0){
                nums[i] = 1;
            }
            else{
                continue;
            }
        }
        for(int i =0; i<nums.length; i++){
            product *= nums[i];
        }

        return signFunc(product);
        
    }
}