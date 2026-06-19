class Solution {
  //APPROACH:-------->>>>> since this is an ascending array, we need to find the index of the last -ve element and starting index of the first +ve element 
  // all the elements before the last -ve element will -ve so we can calculate the total number of -ve elements
  // all the elements after the first +ve element will be +ve so we can calculate the total number of +ve elements
    public int maximumCount(int[] nums) {
        int n =  nums.length;   // length of the input array
        int start = 0;  // starting index of the input array
        int end = n-1;  // ending index of the input array
        int end2 = n-1;  // negative index of the second positive subarray
        int posIndx=nums.length;  // variable for index of first positive element 
        int negIndx=-1;  // variable for index of last negative element
        int newStart = 0; // variable for start index of new positive subarray
        while(start<=end){   // biary search to find the index of last negative element
            int mid = start + (end - start)/2;
            if(nums[mid]<0){   // if the mid element is -ve
                negIndx = mid ;   // storing the index of -ve element
                start = mid + 1;   // moving right to find if other -ve elements are present after
            }
            else{    // if the mid element is +ve or 0
                newStart = mid;   // storing the start index of the new subarry
                end = mid -1;  // moving left to find if other +ve elements are present before this index
            }
        }
        while(newStart <= end2){  // binary search over the new subarray to find the index of first +ve element
            int mid = newStart + (end2 - newStart)/2;
            if(nums[mid]==0){   // if the mid element is 0
                newStart = mid + 1;  // moving right
            }
            else{
                posIndx = mid;   // storing the value of the positive element 
                end2 = mid -1;  // moving left to find if any other +ve element is present before this index
            }
        }
        int finalans = Math.max(negIndx+1,n-posIndx);   // calculating max of negative elements and the positive elements
        return finalans;   
    }
}