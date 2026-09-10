class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int i = 0; i < nums.length ; i++){
            if(map.get(nums[i]) == 1 ){
                answer = nums[i];
            }
        }
        return answer;
    }
}
//this problem also needs to be solved using bit manipulation but i have solved it using hashmap and it is very inefficient so we should think about bit manipulation