class Solution {
    public int smallestEvenMultiple(int n) {
        if(n % 2 == 0){   // when n is even... n will be the smallest multiple of both n and 2
            return n;
        }
        else{
            return 2*n;  // when n is odd, 2 * n will be the smallest multiple of 2 and n both
        }
    }
}