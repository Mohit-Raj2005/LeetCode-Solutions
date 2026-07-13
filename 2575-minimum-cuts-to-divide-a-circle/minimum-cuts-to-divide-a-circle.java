class Solution {
    public int numberOfCuts(int n) {
        int ans = -1;
        if(n == 1){
            return 0;   // explicitly handling the case where we need to cut the circle in just one half i.e, n = 1
        }
        if(n % 2 == 0){ 
            ans = n / 2;  // if we cut it in n even halfs, it will need n/2 cuts
        }
        else{
            ans = n;  // if we cut it in n odd halfs it will need n cuts
        }
        return ans;
    }
}