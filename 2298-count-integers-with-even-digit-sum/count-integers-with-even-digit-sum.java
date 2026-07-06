class Solution {
    public int countEven(int num) {
        int count =0;
        for(int i = 1; i <= num ; i++){
            int sum = 0;
            int number = i;
            while(number > 0){
                int lastDigit = number % 10;
                sum += lastDigit;
                number /= 10;
                
            }
            if(sum % 2 == 0){
                count++;
            }
        }
        return count;
    }
}