class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int allsum = n*(n+1)/2;
        int sumofinput=0;
        int val=0;
        for(int i=0;i<n;i++){
            sumofinput+=nums[i];

        }
        if(allsum>sumofinput){
            val = allsum-sumofinput;
        }
        return val;
        
        
    }
}