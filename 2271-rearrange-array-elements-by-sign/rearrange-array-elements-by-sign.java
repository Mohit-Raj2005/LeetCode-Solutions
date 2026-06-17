class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] negArr = new int[nums.length/2];
        int[] posArr = new int[nums.length/2];
        int indxPos =0;
        int indxNeg =0;
        for(int j =0;j<nums.length;j++){
            if(nums[j]>0){
                posArr[indxPos]=nums[j];
                indxPos++;
            }
            else{
                negArr[indxNeg] = nums[j];
                indxNeg++;
            }
        }
        int m =0;
        int n =0;
        for(int i = 0; i <nums.length;i++){
            if(i%2==0){
                nums[i]=posArr[m];
                m++;
            }
            else{
                nums[i]= negArr[n];
                n++;
            }
        }

        return nums;
    }
}