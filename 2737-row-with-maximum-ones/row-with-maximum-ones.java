// class Solution {
//     static int firstOccurenceOne(int[][]mat, int row){
//         int start = 0;
//         int end = mat[0].length - 1;
//         int startIndx = -1;
//         while(start <= end){
//             if(mat[row][end] == 0){
//                 return end + 1;
//             }
//             int mid = start + (end - start) / 2;
//             if(mat[row][mid] == 1){
//                 startIndx = mid;
//                 end = mid - 1;
//             }
//             else{
//                 start = mid + 1;
//             }
//         }
//         return startIndx;

//     }
//     public int[] rowAndMaximumOnes(int[][] mat) {
//         int maxOne = 0;
//         int rowIndx = 0;
//         int[] ans = new int[2];
//         for(int i = 0; i < mat.length; i++){
//             int firstOccurence = firstOccurenceOne(mat , i);
//             int maxi = mat[0].length - firstOccurence;
//             if(maxi > maxOne){
//                 maxOne = maxi;
//                 rowIndx = i;
//             }
//             else{
//                 continue;
//             }
//         }
//         ans[0] = rowIndx;
//         ans[1] = maxOne;
//         return ans;
//     }
// }
class Solution {
   public int[] rowAndMaximumOnes(int[][] mat){
        int indx = 0;
        int maxOne = 0;
        int[] ans = new int[2];
        for(int i = 0; i < mat.length ; i++){
            int oneCount = 0;
            for(int j = 0; j<mat[0].length; j++){
                if(mat[i][j]==1){
                    oneCount++;
                }
                else{
                    continue;
                }
            }
            if(oneCount > maxOne){
                maxOne = oneCount;
                indx = i;
            }
        }
        ans[0] = indx;
        ans[1] = maxOne;
        return ans;
    }
}