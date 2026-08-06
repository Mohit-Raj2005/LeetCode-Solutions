class Solution {
    public int smallestNumber(int n, int t) {
        for (int i = 0; i < 11; i++) {
            int prod = 1;
            int temp = n;
            while (temp > 0) {
                int last = temp % 10;
                prod = prod * last;
                temp = temp / 10;
            }
            if (prod % t == 0) {
                return n;
            } else {
                prod = 1;
                n++;
            }
        }
        return 0;
    }
}