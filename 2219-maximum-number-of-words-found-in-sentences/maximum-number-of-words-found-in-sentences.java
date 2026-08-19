class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i = 0; i < sentences.length; i++){
            String temp = sentences[i];
            String[] ans = temp.split(" ");
            System.out.println(Arrays.toString(ans));
            max = Math.max(max , ans.length);
        }
        return max;
    }
}