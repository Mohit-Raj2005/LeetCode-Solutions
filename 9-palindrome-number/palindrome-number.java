class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int original =x;
        if(x<0){
            return false;
        }       
        while(original>0){
            int n = original % 10;
            rev = rev * 10 + n;
            original = original / 10;
        }
        if(rev == x){
        return true;
        } 
        return false;
    }
}