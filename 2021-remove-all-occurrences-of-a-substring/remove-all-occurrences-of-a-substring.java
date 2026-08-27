class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){   // till string s contains part string
            int index = s.indexOf(part);      // get the leftmost occurence of the part string
            s = s.substring(0, index) + s.substring(index + part.length());   // addin the substring from 0 to index and then appending the substring from index + part.length till end 
            // creating a new substring and updating the s substring
        }
        return s;   // returning the final string s
    }
}