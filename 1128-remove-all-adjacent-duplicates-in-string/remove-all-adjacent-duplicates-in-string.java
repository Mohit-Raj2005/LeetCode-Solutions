class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();  // creating the stringbuilder 
        for(int i =0; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ans.length() == 0){
                ans = ans.append(ch);
            }

            else if(ans.charAt(ans.length() - 1) == ch){
                ans.deleteCharAt(ans.length() - 1);
            }
            else{
                ans.append(ch);
            }


        }
        return ans.toString();
    }
}

// the approach is that we are iterating over the string character by character and checking if that character is same as the rightmost character of the stringbuilder ans, if true , we will delete that char from the string builder else we will append that character to the ans and finally we will return the ans 