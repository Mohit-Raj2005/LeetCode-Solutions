class Solution {
    static void prefixSum(int[] inputArray){
        for(int i = 1; i < inputArray.length; i++){
            inputArray[i] = (inputArray[i- 1] + inputArray[i]) % (1000000007);
        }
    }
    public int valueAfterKSeconds(int n, int k) {
        int[] inputArray = new int[n];
        for(int i = 0; i < n; i++){
            inputArray[i] = 1;
        }
        for(int i = 1; i <= k; i++){
            prefixSum(inputArray);
        }
        return inputArray[n - 1] % (1000000007);
    }
}