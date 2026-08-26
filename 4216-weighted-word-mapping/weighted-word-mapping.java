class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        int k = 0;
        for(int i = 0; i< words.length && k < weights.length; i++){
            int sum = 0;
            int map = 0;
            for(int j = 0; j < words[i].length(); j++){
                char ch = words[i].charAt(j);
                sum += weights[ch - 'a'];
                // k++;
            }
            System.out.println(sum);
             map = sum % 26;
            int answer = 'z' - map;
            // System.out.println(answer);
            // System.out.println((char)('z' - map));
            ans.append((char)('z' - map));
        }
        return ans.toString();
    }
}