class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0; // initialising sum with 0
        while(n>0){
            int digit = n % 10;  // extracting the last digit of the integer
            sum += digit;      // adding the last digit to the sum
            n = n/10;       // removing the last digit by dividing it by 10 and rounding off to an integer value
        }
        return sum;   // finally returning the sum
    }
}