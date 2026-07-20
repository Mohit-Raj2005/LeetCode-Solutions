class Solution {
    public boolean isThree(int n) {
        if(n == 1 || n == 0){
            return false;
        }
        int divisiorCount = 0;
        for(int i = 1;i <= n; i++){
            if(n % i == 0){
                divisiorCount++;
            }
        }
        return (divisiorCount == 3) ;
    }
}