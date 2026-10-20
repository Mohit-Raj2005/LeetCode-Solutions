class Solution {
    static void solve(List<List<Integer>> ans, List<Integer> set, int[] nums) {
        if (set.size() == nums.length) {
            ans.add(new ArrayList<>(set));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]) == false) {
                set.add(nums[i]);
                solve(ans, set, nums);
                set.remove(set.size() - 1);
                System.out.println(set);
            }
            // System.out.println(set);
        }

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        int index = 0;
        solve(ans, set, nums);
        return ans;
    }
}