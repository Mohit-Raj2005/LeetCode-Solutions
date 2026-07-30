class Solution {
    public void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j =0;
        while(j<nums.length){
            if(nums[j]!=0){
                ans[i] = nums[j];
                i++;
                j++;
            }
            else{
                  j++;
                ans[nums.length +i - j] = 0;
              
            }
        }
        for(int m = 0; m<nums.length ; m++){
            nums[m] = ans[m];
        }

    }
}