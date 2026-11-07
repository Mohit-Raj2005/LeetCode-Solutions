class Solution {
    public int minMoves(int target, int maxDoubles) {
        int ans = target;
        int count = 0;
        if(target == 1){
            return 0;  // checking if the target is already 1
        }
        if(maxDoubles == 0){ // checking if double option is available or not
            return target - 1;  // if no, we can directly return target - 1
        }
        while (ans != 1) {  
            if (ans % 2 == 0 && maxDoubles != 0) {  // following backward approach, divide by 2 if element is even and maxDoubles != 0, decreasing the target element to 1 by the rules given
                ans /= 2;
                count++;
                maxDoubles--;
            } else if(ans % 2 != 0 && maxDoubles != 0){  // decreasing if element is odd and maxDoubles != 0 i.e, we can later divide further 
                ans -= 1;
                count++;
            }
            else{ 
                // if the element is odd and no division is left 
                count += ans - 1;   // directly calculating the final count rather than repeated decrement
                ans = 1;
            }
        }
        return count;
    }
}