
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int [] result = new int[nums.length]; //initialising the result array  
        int index = 0;      // intialising the index
        for(int element: nums){   // for each loop over nums array
            if(element < pivot){  // inserting the elements lesser than the pivot element in the result array 
                result[index] = element;
                index++;
            }
        }
        for(int element: nums){
            if(element == pivot){     // inserting pivot elements in the result array
                result[index] = element;
                index++;
            }
        }
        for(int element: nums){
            if(element > pivot){    // inserting elements greater than the pivot elements in the result array
                result[index] = element;
                index++;
            }
        }
         return result;
    }
}
 //this solution was not the optimal solution but was accepted
// class Solution {
//     public int[] pivotArray(int[] nums, int pivot) {
//         ArrayList<Integer> lessPivot = new ArrayList<>();  
//         ArrayList<Integer> inputPivot = new ArrayList<>();
//         ArrayList<Integer> morePivot = new ArrayList<>();
//         ArrayList<Integer> finalresult = new ArrayList<>();   <----- finalresult list to store both the lists
//         int[] result = new int[nums.length];
//         for(int i=0; i<nums.length;i++){
//             if(nums[i]<pivot){
//                 lessPivot.add(nums[i]);   <----- list for elements lesser than the pivot element
//             }
//             else if(nums[i]>pivot){
//                 morePivot.add(nums[i]);    <----- list for elements greater than the pivot element
//             }
//             else{
//                 inputPivot.add(nums[i]);   <------ separate list for all the pivot elements in the input array
//             }
//         }
//         finalresult.addAll(lessPivot);    <----- adding all the elements of lessPivot list to finalresult
//         finalresult.addAll(inputPivot);  <----- adding pivot elements to the finalresult
//         finalresult.addAll(morePivot);       <----- adding all the elements of lessPivot list to finalresult
//         for(int i=0; i<finalresult.size();i++){   <----- iterating the finalresult list and adding it to the result array
//             result[i] = finalresult.get(i);    
//         }
        
//          return result;
//     }
// }
