class Solution {
    public int findDuplicate(int[] nums) {
        //This is a brute force method to solve this problem with runtime complexity of O(n2) but this solutin passes all the sample testcases but fails some hidden testcases on submission Time limit exceeded 
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return -1;
        // }

//this is a more efficient way of solving this problem with a runtime complexity of O(n) using a hashmap for storing the elements and its frequencies with getOrDefault method and then returning the key with frequency more than 1 else returning -1.
  
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1); 
        }
        for(int j=0;j<nums.length;j++){
            if(map.get(nums[j])>1){
                return nums[j];
            }
        }
        return -1;
    }
}