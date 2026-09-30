class Solution {
    public int reverseDegree(String s) {
        int prod = 0;
        for(int i = 0; i < s.length(); i++){
            int temp = (27 - ( s.charAt(i) - 'a' + 1)) * (i + 1); // to calculate the reverse degree of the character 
            prod += temp;
        }
        return prod;
    }
}