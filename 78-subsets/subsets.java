class Solution {
    public static void solve(int[] nums, int index, List<List<Integer>> ans, List<Integer> set) {
        if (index >= nums.length) {
            ans.add(new ArrayList<>(set));
            return;
        }

        int currentElement = nums[index];

        set.add(currentElement);
        solve(nums, index + 1, ans, set); // include element call 

        // BackTracking step... when we backtrack and fire a exclude call we need to backtrack to the previous state 
        set.remove(set.size() - 1); // removing the last added element i.e, backtracking to the last element
        solve(nums, index + 1, ans, set); // exclude call after backtracking

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> set = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        solve(nums, 0, ans, set);
        return ans;

    }
}