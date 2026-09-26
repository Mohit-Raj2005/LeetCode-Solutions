class Solution {
    public double myPow(double x, int n) {
        // double ans = x;
        // int loop = n;
        // while(n >0){
        //     // ans *= ans;
        //     // loop--;
        //     x *= x;
        //     n--;
        // }
        // return x;
        // if(x==1){
        //     return 1;
        // }
        // else{
        //     double m = x * myPow(x,n-1);
        //     return m;
        // }
        return Math.pow(x,n);
    }
}