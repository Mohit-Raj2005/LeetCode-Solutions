class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newarray = new int[2*nums.length];
        for(int i = 0; i< nums.length ; i++){
            newarray[i] = nums[i];
            newarray[nums.length + i] = nums[i];
        }
        return newarray;

    }
}