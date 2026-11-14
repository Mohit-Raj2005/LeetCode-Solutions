class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;
        for (int length = l; length <= r; length++) {
            for (int start = 0; start <= nums.size() - length; start++) {
                int sum = 0;
                for (int k = start; k <= start + length - 1; k++) {
                    sum += nums.get(k);
                }
                if (sum > 0) {
                    ans = Math.min(ans, sum);
                }
            }
        }
        if (ans < Integer.MAX_VALUE) {
            return ans;
        } else {
            return -1;
        }
    }
}