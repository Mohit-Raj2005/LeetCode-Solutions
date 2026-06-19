class Solution {
    public int countNegatives(int[][] grid) {
        int row = grid.length;  //number of rows
        int col = grid[0].length;  // number of columns
        int negCount = 0;    // total negative elements
        int negIndx =  - 1;   // variable for storing the starting index of the negative element
        int i =0;   // i variable for counting the rows
        while(i<row){
            int start =0;    // starting index for each row
            int end = col-1;  // ending index for each row
            while(start<=end){   // applying binary search to find the starting index of the negative element in each row
                int mid = start + (end - start)/2;
                if(grid[i][mid]<0){
                    negIndx = mid;
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
            if(negIndx>-1){    // if there is negative element present 
                negCount = negCount + col - negIndx;  // calculating the number of total negative elements in that row and adding it to the previous count of negative elements
            } 
            i++;  // increasing the row count
        }
        return negCount;
    }
}