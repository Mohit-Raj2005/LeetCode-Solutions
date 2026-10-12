class Solution {
    static boolean solve(int index,int[] nums,Boolean[]dp ){
        if(index >= nums.length - 1){
            return true;
        }
        if(index < nums.length - 1 && nums[index] == 0){
            return false;
        }
        if(dp[index] != null){
            return dp[index];
        }
        boolean choose = false;
        for(int i = 1; i <= nums[index] ; i++){
            boolean temp = solve(index + i,nums,dp);
            if(temp == true){
                return true;
            }
            choose = choose || temp;
            dp[index] = choose;
        }
        return dp[index];   // this is the dynamic Programming based solution 

        // this is the recursive solution without dp which gives TLE
        // boolean choose = false;
        // for(int i = 1; i <= nums[index] ; i++){
        //     boolean temp = solve(index + i,nums);
        //     choose = choose || temp;
        // }
        // return choose;
    }
    public boolean canJump(int[] nums) {
       int index = 0;
       Boolean[] dp = new Boolean[nums.length + 1];
       boolean ans = solve(index , nums,dp);
       return ans;
    }
}