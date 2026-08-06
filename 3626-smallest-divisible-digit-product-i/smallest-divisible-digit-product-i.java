class Solution {
    public int smallestNumber(int n, int t) {

        for (int i = 0; i < 11; i++) {
            int sum = 1;
            int temp = n;
            while (temp > 0) {
                int last = temp % 10;
                sum = sum * last;
                temp = temp / 10;
            }
            if (sum % t == 0) {
                return n;
            } else {
                sum = 1;
                n++;
            }
        }
        return 0;
    }
}