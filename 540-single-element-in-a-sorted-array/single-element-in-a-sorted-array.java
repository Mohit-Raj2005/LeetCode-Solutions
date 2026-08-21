class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (start == end) {
                return nums[end]; // for single element 
            }
            int currentElement = nums[mid];  
            int prevElement = -1;
            if (mid - 1 >= 0) {
                prevElement = nums[mid - 1];
            }
            int nextElement = -1;
            if (mid + 1 <= end) {
                nextElement = nums[mid + 1];
            }
            if (prevElement != currentElement && nextElement != currentElement) {  // if it is the single elment in the array 
                return currentElement;
            }

            if (prevElement != currentElement && nextElement == currentElement) {    // if the nextElement and the currentElement are same and mid is the starting index of that pair
                if (mid % 2 != 0) {   // if starting index mid of that pair is odd then ans lies on the left of mid
                    end = mid - 1;
                } else {
                    start = mid + 1;   // else ans lies on the right of the mid
                }
            } else if (prevElement == currentElement && nextElement != currentElement) {   // if the prevElement and the currentElement matches and the nextElement do not match then the currentIndex mid is the ending index of that pair 
                if (mid % 2 != 0) {   // if the ending index is odd then ans lies on the right of the mid
                    start = mid + 1;
                } else {
                    end = mid - 1;  // else ans lies on the left of the mid 
                }
            }
        }
        return 0;
    }
}