class Solution {
    static void solve(List<List<Integer>> ans, int[] candidates, int index, int target, List<Integer> set) {
        if (target == 0) {
            ans.add(new ArrayList<>(set));
            return;
        }

        if (target < 0) {
            return;
        }

        if (index >= candidates.length) {
            return;
        }
        set.add(candidates[index]);
        solve(ans, candidates, index, target - candidates[index], set);

        set.remove(set.size() - 1);
        solve(ans, candidates, index + 1, target, set);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        int index = 0;
        solve(ans, candidates, index, target, set);
        return ans;

    }
}