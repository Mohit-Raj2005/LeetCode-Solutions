class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        // int i = 0;
        // int j = nums.length - 1;
        for(int i = 0; i<nums.size(); i++){
            for(int j = i + 1 ; j<nums.size() ; j++){
                if(nums.get(i) + nums.get(j) < target){
                    count++;
                }
                else{
                    continue;
                }
            }
        }
        return count;
    }
}