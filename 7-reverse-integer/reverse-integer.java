class Solution {
    public int reverse(int x) {
        long rev = 0;
        int input = x;
        if (x < Integer.MAX_VALUE && x > Integer.MIN_VALUE) {
            while (input != 0) {
                int last = input % 10;
                if (rev + last <= Integer.MAX_VALUE && rev + last >= Integer.MIN_VALUE) {
                    rev = rev * 10 + last;
                    input = input / 10;
                } else {
                    return 0;
                }
                
            }
        } else {
            return 0;
        }
        if (rev < Integer.MAX_VALUE && rev > Integer.MIN_VALUE) {
           return (int) rev;
        } else {
            return 0;
        }

    }
}