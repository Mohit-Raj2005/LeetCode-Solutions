class Solution {
    static void solve(List<List<Integer>> ans, List<Integer> set, int k, int n, int[] arr, int index ){
        if(n == 0 && set.size() == k){
            ans.add(new ArrayList<>(set));
            return;
        }
        if(set.size() > k){
            return;
        }
        if(n < 0){
            return;
        }
        if(index >= arr.length){
            return;
        }
        
        set.add(arr[index]);
        solve(ans, set, k, n - arr[index], arr, index + 1);

        set.remove(set.size() - 1);
        solve(ans, set, k, n, arr, index + 1);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        int index = 0;
        solve(ans, set, k, n, arr, index);
        return ans;
    }
}