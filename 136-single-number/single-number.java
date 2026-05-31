class Solution {
    //xor concept 
    //concept-> 4^1^2^1^2=4 || similar elements 1 and 2 will get cancelled out and 4 will be returned

    public int singleNumber(int[] nums) {
        int value=0;
        for(int i:nums){
            value= value^i;   // xor of all the elements and the repeating elements will get cancelled out and the unique element will be returned
        }
        return value;  
    }
}