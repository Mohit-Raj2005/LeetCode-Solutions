class Solution {
    public int scoreOfString(String s) {
        int ans = 0;   // variable to store the absolute answer
        for(int i =0; i<= s.length()-2;i++){   // iterating the string 
            ans += Math.abs(s.charAt(i) - s.charAt(i+1));   // calculating the absolute difference of the adjacent characters of the string
        }
        return ans;
    }
}