class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     int startingrow = 0;
     int startingcol = 0;
     int endingrow = matrix.length-1;
     int endingcol = matrix[0].length-1;
    ArrayList<Integer> spiralArray = new ArrayList<>();
    while(startingrow<=endingrow && startingcol<=endingcol){
        //row wise L->R  -->from startingcol to endingcol
        for(int col=startingcol;col<=endingcol;col++){
        spiralArray.add(matrix[startingrow][col]);  
        }
        startingrow++;
        //Column wise T->B ---> from startingrow to endingrow
        for(int row=startingrow;row<=endingrow;row++){
            spiralArray.add(matrix[row][endingcol]);  
        }
        endingcol--;
        //row wise R->L ---> from endingcol to startingcol
        //but checking if there is any valid row to print
        if(startingrow<=endingrow){
            for(int col = endingcol;col>=startingcol;col--){ 
            spiralArray.add(matrix[endingrow][col]);
        }
        endingrow--;
        }
        
        //Column wise B->T --> from endingrow to startingrow
        //but checking if there is any valid column to print
        if(startingcol<=endingcol){
        for(int row = endingrow;row>=startingrow;row--){
         spiralArray.add(matrix[row][startingcol]);  
        }
        startingcol++;
        }
        
     }
     
    
    return  spiralArray;    
       
    }
    
}