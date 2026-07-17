class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        //we are using two pointers on the array and then swapping the characters from the start and the end and then moving the pointers respectively 
        while(start <= end){
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--; 
        }
    }
}