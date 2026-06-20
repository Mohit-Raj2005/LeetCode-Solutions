class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        // checking all the consecutive elements one by one if they are odd or even 
        for(int i=0; i<arr.length-2;i++){   // running loop till arr.length-2 so that we check till the third last element and the below logic will check the further elements till end  
            if(arr[i] %2 !=0 & arr[i+1] % 2!=0 & arr[i+2] % 2 !=0){  // checking that the current element and the next element and the next to next elements all are odd 
                return true;
            }
        }
        return false;
    }
}