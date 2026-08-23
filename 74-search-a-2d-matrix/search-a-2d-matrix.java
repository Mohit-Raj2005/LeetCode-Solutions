class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;
        int totalElement = totalRow * totalCol;  // calculating the total number of elements in the array to find the end index as in 1d array
        int start = 0;
        int end = totalElement - 1;    // end index of the 1d representation of this matrix
        while(start <= end){
            int mid = start + (end - start) / 2;
            // we are applying the concept similar to 1D array and for accessing the mid element, we are just passing the rowIndex and the colIndex of the mid element in the matrix or in other words we can say that we are converting the mid index into the rowIndex and the col INdex of the array
            int rowIndex = mid / totalCol;   // formula for rowIndex
            int colIndex = mid % totalCol;  // formula for colIndex
            if(matrix[rowIndex][colIndex] == target){
                return true;
            }
            if(matrix[rowIndex][colIndex] > target){
                // if the element is greater than the target move left 
                end = mid - 1;
            }
            else{
                start = mid + 1;  // move right
            }
        }
        return false;
    }
}