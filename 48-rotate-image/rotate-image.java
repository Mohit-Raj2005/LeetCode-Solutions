class Solution {
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        //Step 1: Transpose of a matrix
        for(int i=0 ;i<n;i++){
            for(int j=i;j<n;j++){
               int temp = matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
            }
        }
        // Step 2: Reverse all rows
        // similar to reversing in 1D array using 2 pointer approach
        for(int row=0;row<n;row++){   // for each row we will be reversing the row elements
            int startcol=0;
            int endcol=n-1;
            while(startcol<=endcol){
                //Swapping elements for reversing the array using two pointer approach
                int temp = matrix[row][startcol];
                matrix[row][startcol] = matrix[row][endcol];
                matrix[row][endcol]=temp;
                startcol++;
                endcol--;
            }

        }
    }
}