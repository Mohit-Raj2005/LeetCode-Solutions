class Solution {

    //Method 2 this is a more efficient and optimal way in terms of space utilization
    // T.C-----> O(n)
    public int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int[] finalArr = new int[nums.length];
        for(int i =0 ; i< nums.length;i++){
            if(nums[i]>0){
                finalArr[pos]=nums[i];
                pos+=2;       // at even indices we are adding the positive elements of nums
            }
            else{ 
                finalArr[neg] = nums[i];
                neg+=2;    //at odd indices we are adding negative elements of numa
            }
        }
        return finalArr;

    }
    // solved and runtime was 5ms.... optimization in terms of memory utilization can be done
    //Method 1      T.C-----> O(n)
    // public int[] rearrangeArray(int[] nums) {
    //     int[] negArr = new int[nums.length/2];    //for storing all the negative elements
    //     int[] posArr = new int[nums.length/2];     // for storing all the negative elements
    //     int indxPos =0;
    //     int indxNeg =0;
    //     for(int j =0;j<nums.length;j++){
    //         if(nums[j]>0){
    //             posArr[indxPos]=nums[j];
    //             indxPos++;
    //         }
    //         else{
    //             negArr[indxNeg] = nums[j];
    //             indxNeg++;
    //         }
    //     }
    //     int m =0;
    //     int n =0;
    //     for(int i = 0; i <nums.length;i++){
    //         if(i%2==0){   the approach can be that at even indices we are adding positive elements
    //             nums[i]=posArr[m];
    //             m++;
    //         }
    //         else{   and at odd indiced we are adding negative elements
    //             nums[i]= negArr[n];
    //             n++;
    //         }
    //     }

    //     return nums;
    // }
}