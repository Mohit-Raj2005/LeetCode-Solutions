class Solution {
    public String triangleType(int[] nums) {
        int n = nums.length;
       int sum = 0;
       Boolean formsTrinangle =false;
        String ans = "none";
        for(int i =0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            if(sum - nums[i] > nums[i]){
                formsTrinangle = true;
            }
            else{
                formsTrinangle = false;
                break;
            }
        }
        if(formsTrinangle){
           
                
                if(nums[0]==nums[1] && nums[1] == nums[2] && nums[2]==nums[0]){
                    ans= "equilateral";
                }
                else if(nums[0]==nums[1] || nums[1] == nums[2] || nums[2]==nums[0]){
                    ans= "isosceles";
                }
                else{
                    ans= "scalene";
                }
            

        }

        
       return ans; 
    }
}