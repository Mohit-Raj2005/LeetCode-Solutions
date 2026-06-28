class Solution {
    public boolean judgeCircle(String moves) {
        int Left = 0;  // count variable to count the left moves
        int Right = 0;  // count variable to count the right moves
        int Up = 0;  // count variable to count the up moves
        int Down = 0;  // count variable to count the down moves
        char move[] = moves.toCharArray();   // converting string to an array
        for(int i=0;i<moves.length();i++){  //iterating through the string or can the character array
            if(move[i] == 'L'){  // checking if the character is L
                Left++;
            }
            if(move[i] == 'R'){  // checking if the character is R
                Right++;
            }
            if(move[i] == 'U'){  // checking if the character is U
                Up++;
            }
            if(move[i] == 'D'){  // checking if the character is D
                Down++;
            }
        }
        if(Left == Right && Up == Down){
            return true;
        }
      return false;  
    }
    
}