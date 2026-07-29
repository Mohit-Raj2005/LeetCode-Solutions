class Solution {
    public int reverse(int x) {
        long rev = 0;   // initialised rev with long to store the reversed integer
        int input = x;
            while (input != 0) {
                int last = input % 10;
                rev = rev * 10 + last;
                input = input / 10;
            }
        if(rev<Integer.MAX_VALUE&&rev>Integer.MIN_VALUE){    // checking if the rev lies in the range of integers 
        return (int) rev;   // typecasting long into int 
        }
        else{
        return 0;
        }
    }
}