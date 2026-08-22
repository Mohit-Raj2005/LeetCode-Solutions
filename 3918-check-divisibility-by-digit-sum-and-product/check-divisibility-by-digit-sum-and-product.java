class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int nums = n;
        while(nums > 0){
            int last = nums % 10;
            sum += last;
            prod *= last;
            nums /= 10;
        }
        if(n % (sum + prod) == 0){
            return true;
        }
        return false;
    }
}