class Solution {
    static void solve(List<List<Integer>> ans, List<Integer> set, int index, int target, int[] candidates){
        if(target == 0){
            ans.add(new ArrayList<>(set));
            return;
        }
        if(target < 0){
            return;
        }
        if(index >= candidates.length){
            return;
        }

        set.add(candidates[index]);
        solve(ans, set, index + 1, target - candidates[index], candidates);

        set.remove(set.size() - 1);

        while(index + 1 < candidates.length && candidates[index] == candidates[index + 1]){
            index++;
        }

        solve(ans, set, index + 1, target, candidates);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        Arrays.sort(candidates);
        int index = 0;
        solve(ans, set, index, target, candidates);
        return ans;
    }
}