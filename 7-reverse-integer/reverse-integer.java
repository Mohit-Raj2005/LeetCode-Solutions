class Solution {
    public int reverse(int x) {
        long rev = 0;
        int input = x;
            while (input != 0) {
                int last = input % 10;
                rev = rev * 10 + last;
                input = input / 10;
            }
        if(rev<Integer.MAX_VALUE&&rev>Integer.MIN_VALUE){
        return (int) rev;
        }
        else{
        return 0;
        }
    }
}