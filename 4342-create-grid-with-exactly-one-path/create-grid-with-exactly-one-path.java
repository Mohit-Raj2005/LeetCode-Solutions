class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        String temp = ".";
        if(n == 1){
            for(int i = 0; i < m; i++){
                ans[i] = ".";
            }
            return ans;
        }
        for(int i = 1; i < n; i++){
            temp = temp + ".";
        }
        ans[0] = temp;
        for(int i = 1; i < m; i++){
            String temp2 = "#";
            for(int j = 1; j < n - 1; j++){
                temp2 = temp2 + "#";
            }
            ans[i] = temp2 + ".";
        }
        return ans;
    }
}