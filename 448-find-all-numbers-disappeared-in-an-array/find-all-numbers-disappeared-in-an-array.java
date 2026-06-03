class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //List<Integer> resultarr = new ArrayList<>();
        List<Integer> finalarr = new ArrayList<>();

        //marking
        for(int i=0;i<nums.length;i++){
                int mark=Math.abs(nums[i])-1;
                if(nums[mark]>0){
                nums[mark]=-nums[mark];
                }
        }
        for(int j=0; j<nums.length;j++){
           if(nums[j]>0){
            finalarr.add(j+1);
           }
        }
        return finalarr;
    }
}