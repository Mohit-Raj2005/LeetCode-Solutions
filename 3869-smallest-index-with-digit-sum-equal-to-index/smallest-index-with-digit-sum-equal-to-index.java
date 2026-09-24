class Solution {
    static int sumNum(int n){
        int sum = 0;
        while(n>0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            // int sum = 0;
            // int num = nums[i];
            // while(num >=0){
            //     sum += num % 10;
            //     num /= 10;
            // }
            if(i == sumNum(nums[i])){
                return i;
            }
            // else{
            //     return -1;
            // }
            // int sum = sumNum(nums[i]);
            // arr[i] = sum;
        }
        // for(int i = 0; i<nums.length; i++){
        //     if(arr[i] == i){
        //         return i;
        //     }
        // }
        return -1;
    }
}