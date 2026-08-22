class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;
        int row = 0;   // starting from the top right corner of the matrix and moving only left for smaller value and down for larger value
        int col = totalCol - 1;
        while(row < totalRow && col >=0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(target < matrix[row][col] ){
                // if target is lesser than the current row and col element 
                // move left in the same row
                col--;
            }
            else{
                // if terget is greater than the current row and col element
                // move down for the larger value
                row++;
            }
        }
        return false;
    }
}

// the concept is to move from top right to left for smaller and down for larger element one by one scanning the current index element