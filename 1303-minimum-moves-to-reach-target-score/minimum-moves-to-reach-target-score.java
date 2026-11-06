class Solution {
    public int minMoves(int target, int maxDoubles) {
        int ans = target;
        int count = 0;
        if(target == 1){
            return 0;
        }
        if(maxDoubles == 0){
            return target - 1;
        }
        while (ans != 1) {
            if (ans % 2 == 0 && maxDoubles != 0) {
                ans /= 2;
                count++;
                maxDoubles--;
            } else if(ans % 2 != 0 && maxDoubles != 0){
                ans -= 1;
                count++;
            }
            else{  
                count += ans - 1;
                ans = 1;
            }
        }
        return count;
    }
}