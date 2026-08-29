class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            // remove all the trailling white spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            int j = i;
            // moving j to the starting index of the word 
            // finding the start index of the word 
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }
            
            // appending that substring word from the starting index to end index of that word to the ans 
            ans.append(s.substring(j+1 , i+1));

            while(j >= 0 && s.charAt(j) == ' '){
                j--;         // removing all the extra spaces after the appending the word and then just add 1 space
            }

            if(j < 0){    // if we reach to the starting of the string means 
                break;
            }

            ans.append(' ');   // after adding the first word we will add a space 

            i = j;  // now moving to the next word or repeating the same process again by moving i to the ending index of j  
        }
        return ans.toString();   /// converting the stringbuilder to string and returning it 
        
    }
}