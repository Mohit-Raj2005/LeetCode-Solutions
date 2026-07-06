class Solution {
    public int findNumbers(int[] nums) {
       int evencount = 0;
       for(int num : nums){
        if(Integer.toString(num).length() % 2 == 0){
            evencount++;
        }
       } 
       return evencount;
    }
}