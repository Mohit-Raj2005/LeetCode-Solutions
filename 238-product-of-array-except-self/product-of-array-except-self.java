class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int prefixProd = 1;
        int suffixProd = 1;
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            prefixProd *= nums[i];
            prefix[i] = prefixProd;
            suffixProd *= nums[nums.length - i - 1];
            suffix[nums.length - i - 1] = suffixProd;
        }
        System.out.println(Arrays.toString(suffix));
        System.out.println(Arrays.toString(prefix));
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                answer[i] = suffix[i + 1];
            } else if (i == nums.length - 1) {
                answer[i] = prefix[i - 1];
            } else {
                answer[i] = prefix[i - 1] * suffix[i + 1];
            }
        }
        // return suffix;
        return answer;
    }
}