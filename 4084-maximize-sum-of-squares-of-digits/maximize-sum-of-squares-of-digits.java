class Solution {
    public String maxSumOfSquares(int num, int sum) {
      StringBuilder stringAns = new StringBuilder();
        if(9*num < sum){            // 9*num will be the maximum value that sum can have,i.e, 0< sum < 9*sum for valid having a valid good integer... if sum > 9*num then it is impossible for num digits to have digitSum = sum 
            return "";
        }
        else{
            while(sum > 0){
                stringAns.append(Math.min(9,sum));
                sum = sum - 9;
            }
        }
        int sbLen = stringAns.length();
        for(int i = 0; i < Math.abs(num - sbLen); i++){
            stringAns.append("0");
        }
        return stringAns.toString();
    }
}