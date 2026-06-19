class Solution {
    public int countNegatives(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int negCount = 0;
        int negIndx =  - 1;
        int i =0;
        while(i<row){
            int start =0;
            int end = grid[0].length-1;
            while(start<=end){
                int mid = start + (end - start)/2;
                if(grid[i][mid]<0){
                    negIndx = mid;
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
            if(negIndx>-1){
                negCount = negCount + grid[i].length - negIndx;
            }
            i++;
        }
        return negCount;
    }
}