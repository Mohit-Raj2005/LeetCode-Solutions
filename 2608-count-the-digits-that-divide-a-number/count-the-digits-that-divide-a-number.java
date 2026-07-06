class Solution {
    public int countDigits(int num) {
        int temp = num;  // temporary variable to store num
        int count = 0;   // count of digits in num that divide num
        while(temp > 0){
            if(num % (temp % 10) == 0){  // checking if the last digit of the temp divides num
                count++;
               
            }
            temp /= 10;  // removing out the last digit to further check the condition for the digits
        }
        return count;   // returning the count
    }
}