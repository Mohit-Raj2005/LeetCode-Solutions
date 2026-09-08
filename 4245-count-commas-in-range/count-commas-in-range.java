class Solution {
    public int countCommas(int n) {
        if(n < 1000){
            return 0;
        }
        else{
            return n - 1000 + 1;
        }



        //this solution can be more optimized with the above logic
        // int count = 0;
        // if(n >=1000){
        //     for(int i = 1000; i <= n; i++){
        //         count++;
        //     }
        // }
        // return count;
    }
}