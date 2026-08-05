class Solution {
    public int numIdenticalPairs(int[] nums) {
        // HashMap<Integer , Integer> map = new HashMap<>();
        // for(int i = 0; i < nums.length ; i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // int ans = 0;
        // for(int i = 0; i<map.length ; i++){
        //     for(int j = 0; j<nums.length ; j++){
                
        //     }
        // }
        
        // return ans;
        int goodPair = 0;
        for(int i =0; i<nums.length ; i++){
            for(int j = i+1; j<nums.length  ; j++){
                    if(nums[i] == nums[j]){
                        goodPair++;
                    }
            }
        }
        return goodPair;
    }
}