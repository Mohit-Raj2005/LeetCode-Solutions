class Solution {
    static int reverse(int n){    // defining a separate reverse function to calculate the reverse of the input integer
        int original = n;
        int reverse = 0;
        while(original>0){
            int lastdigit = original % 10;
            reverse = reverse*(10) + (lastdigit);
            original = original / 10;
        }
        return reverse;
    }
    public int mirrorDistance(int n) {
       int x = Math.abs(n - reverse(n));   // calculating the mirror distance of input integer 
       return x;
    }
}