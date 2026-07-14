class Solution {
    public long coloredCells(int n) {
        long ans = 1;
        // if(n == 1){
        //     return ans;
        // }
        // else if(n > 1){
        //     if(n % 2 ==0){
        //         ans = n * (n + 1) -1;
        //     }
        //     else{
        //         ans = n * (n + 1) + 1;
        //     }
        // }
        // return ans;
        // in each iteration, the number of cells get increased as (4*(i-1)) which get added to the previous cells , with each iteration, the new cells get added  
        for(int i = 1; i <= n; i++){   
            ans = ans + (4 * (i-1));
        }
        return ans;
    }
}