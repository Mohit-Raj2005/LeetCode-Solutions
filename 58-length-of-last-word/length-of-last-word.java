class Solution {
    public int lengthOfLastWord(String s) {
        String[] word = s.split(" ");  // splittig the string at " " to find words and storing it in a Array of string
        // String last = word[word.length - 1];  // 
        // return last.length();
       return word[word.length - 1].length();
    }
}