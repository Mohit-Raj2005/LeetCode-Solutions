class Solution {
    static void solve(List<List<Integer>> ans, int[] nums, List<Integer> set, int index) {
        if (index >= nums.length) {
            ans.add(new ArrayList<>(set));
            return;

            // if (ans.contains(set) == false) {       //this logic will work but it is very inefficient as everytime checking for duplicates will add linear time complexity 
            //     ans.add(new ArrayList<>(set));
            // }
            // return;
        }

        // include case
        int currentElement = nums[index];
        set.add(currentElement);
        solve(ans, nums, set, index + 1);

        //backtracking
        set.remove(set.size() - 1);

        //skipping duplicate values int the nums array by increasing the indices till the elements are same
        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }

        //exclude case
        solve(ans, nums, set, index + 1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        int index = 0;
        Arrays.sort(nums); // sorting the nums array so that if we get series of duplicate values in nums array and if we exclude it we can skip them
        solve(ans, nums, set, index);
        return ans;

    }
}