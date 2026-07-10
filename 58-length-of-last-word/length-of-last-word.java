class Solution {
    public int lengthOfLastWord(String s) {
        String[] word = s.split(" ");  // splittig the string at " " to find words and storing it in a Array of string
        // String last = word[word.length - 1];  // storing the last word in a string
        // return last.length();  // returning the length of the last word


       return word[word.length - 1].length();   // we can directly return the length of the last element of the word array... this is more memory efficient 
    }
}