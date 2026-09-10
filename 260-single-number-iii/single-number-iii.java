class Solution {
    public int[] singleNumber(int[] nums) {
        int[] answer = new int[2];
        int k = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int i = 0; i < nums.length ; i++){
            if(map.get(nums[i]) == 1 && k < 2){
                answer[k++] = nums[i];
            }
        }
        return answer;
    }
}