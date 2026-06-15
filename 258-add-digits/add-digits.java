class Solution {
    public int addDigits(int num) {
        int sum =0;
        int res;
        while(num>0){
            sum = sum + (num % 10);
            num = num /10;
        }
        if(sum<10){
            return sum;
        }
        else{
            num = sum;
            res =addDigits(num);
        }
       return res; 
    }
}