class Solution {
    static void solve(List<List<Integer>> ans, int[] nums, List<Integer> set, int index) {
        if (index >= nums.length) {
            if (ans.contains(set) == false) {
                ans.add(new ArrayList<>(set));
            }
            return;
        }
        int currentElement = nums[index];
        set.add(currentElement);
        solve(ans, nums, set, index + 1);
        

        set.remove(set.size() - 1);
        solve(ans, nums, set, index + 1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        int index = 0;
        Arrays.sort(nums);
        solve(ans, nums, set, index);
        return ans;

    }
}