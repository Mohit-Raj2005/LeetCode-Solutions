class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        int n = arr.length ;
    //    for(int i = 0; i < n ; i++){
    //     ans += arr[i];
    //    }
       for(int i = 0; i < arr.length ; i++){
        int sum = 0;
        for(int j = i; j < arr.length ; j++){
            sum += arr[j];
            if((i + j ) % 2 == 0){
                 ans += sum;
            }  
        }
       
       }
        return ans;
    }
}