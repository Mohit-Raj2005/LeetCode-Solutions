class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftsum = new int[nums.length];  //initialising the leftsum array
        int [] rightsum = new  int[nums.length]; //initialising the rightsum array
        int lefts=0;
        int rights=0;
        for(int i=0;i<nums.length;i++){
            lefts+=nums[i];
            leftsum[i]=lefts;    //Create an array leftsum where leftsum[i] is the sum of all the numbers to the left of index i.

        }
        for(int j=nums.length-1;j>=0;j--){    //running loop from end
            rights+=nums[j];
            rightsum[j]=rights;    //Create an array rightsum where rightsum[i] is the sum of all the numbers to the right of index i.
        }
        for(int k=0;k<rightsum.length;k++){  //For each index i, check if sumLeft[i] equals sumRight[i]. If so, return i. If no such i is found, return -1.
            if(leftsum[k]==rightsum[k]){  
                return k;
            }
        }
        return -1;
        
    }
}