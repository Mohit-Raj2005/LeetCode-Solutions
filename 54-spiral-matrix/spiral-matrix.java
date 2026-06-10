class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     int startingrow = 0;
     int startingcol = 0;
     int endingrow = matrix.length-1;
     int endingcol = matrix[0].length-1;
    ArrayList<Integer> spiralArray = new ArrayList<>();
    while(startingrow<=endingrow && startingcol<=endingcol){
        //row wise L->R  -->from startingcol to endingcol
        for(int i=startingcol;i<=endingcol;i++){
        spiralArray.add(matrix[startingrow][i]);  
        }
        startingrow++;
        //Column wise T->B ---> from startingrow to endingrow
        for(int j=startingrow;j<=endingrow;j++){
            spiralArray.add(matrix[j][endingcol]);  
        }
        endingcol--;
        //row wise R->L ---> from endingcol to startingcol
        //but checking if there is any valid row to print
        if(startingrow<=endingrow){
            for(int k = endingcol;k>=startingcol;k--){
            spiralArray.add(matrix[endingrow][k]);
        }
        endingrow--;
        }
        
        //Column wise B->T --> from endingrow to startingrow
        //but checking if there is any valid column to print
        if(startingcol<=endingcol){for(int l = endingrow;l>=startingrow;l--){
         spiralArray.add(matrix[l][startingcol]);  
        }
        startingcol++;
        }
        
     }
     
    
    return  spiralArray;    
       
    }
    
}