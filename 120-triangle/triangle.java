class Solution {
    static int solve(int indexInRow, int RowIndex, List<List<Integer>> triangle, Integer[][]dp) {
        if (RowIndex == triangle.size()) {
            return 0;
        }
        if (indexInRow >= triangle.get(RowIndex).size()) {
            return 0;
        }
        if(dp[RowIndex][indexInRow] != null){
            return dp[RowIndex][indexInRow];
        }

        int sum = triangle.get(RowIndex).get(indexInRow)
                + Math.min(solve(indexInRow, RowIndex + 1, triangle,dp), solve(indexInRow + 1, RowIndex + 1, triangle,dp));
        dp[RowIndex][indexInRow] = sum;
        return dp[RowIndex][indexInRow];

        // this is the recursion based solution without dynamic programming which gives TLE 
        //    int sum = triangle.get(RowIndex).get(indexInRow) + Math.min(solve(indexInRow, RowIndex + 1, triangle), solve(indexInRow + 1, RowIndex + 1,triangle));
        //    return sum;

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        Integer[][] dp = new Integer[triangle.size() + 1][triangle.size() + 1];     
        int sum = solve(0, 0, triangle,dp);
        return sum;
    }
}

        // int[][] dp = new int[triangle.size() + 1][triangle.size() + 1]; // this will initialise the array with 0 default but if we initialise the array with -1 , there may be value which will have -1 in the array and will be computed so there will be confusion whether it is computed or not so we will use Integer[][] tag so that it will get intialised with null
        // for(int i = 0; i < dp.length; i++){
        //     Arrays.fill(dp[i] , -1);
        // }