class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;  // initialising the variable to store the sum
        for(int i =1; i <= n ; i++){    // iterating over the range 1 --> n
            if((i % 3==0) || (i % 5 == 0) || (i % 7==0)){    // checking for values divisible by 3 or 5 or 7
                sum+=i;
            }
            else{
                continue;
            }
        }
        return sum;
    }
}