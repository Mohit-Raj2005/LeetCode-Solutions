class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols =  matrix[0].length;
        int[][] transposematrix = new int[cols][rows];   //initialising transpose matrix with new int[cols][rows] cols as rows and rows as cols   
        for(int i =0;i<rows;i++){
            for(int j =0 ; j< cols;j++){
                transposematrix[j][i]=matrix[i][j];   //swapping rows and columns of input matrix and transpose matrix
            }
        }
       return transposematrix;
    }
}