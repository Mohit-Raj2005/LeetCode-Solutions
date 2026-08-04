class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> inputList = new ArrayList<>();
        int min = 101;
        int max = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i]<min){
                min = nums[i];
            }
            if(nums[i]>max){
                max = nums[i];
            }
            inputList.add(nums[i]);
        }
        for(int j = min ; j<=max ; j++){
            if(inputList.contains(j)){
                continue;
            }
            else{
                ans.add(j);
            }
        }
        return ans;
    }
}