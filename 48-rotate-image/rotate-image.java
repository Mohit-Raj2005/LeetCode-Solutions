// [INTERVIEW IMPORTANT]
//Amazon, Paytm , Microsoft , Adobe
//SOlUTION APPROACH
//Step 1: Taking the transpose of the input matrix
//Step 2: Reversing each row of the transpose matrix will give us the rotated matrix clockwise
        //Step 2.1: we will be going to each row
        //Step 2.2: we will be reversing each row using two pointer approach like in 1D arrray
// and reversing each column would same as anticlockwise
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