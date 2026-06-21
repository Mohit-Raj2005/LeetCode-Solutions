class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for(int i = 0;i<accounts.length;i++){
            int money = 0;
            for(int j=0;j<accounts[0].length;j++){
                money = money + accounts[i][j];
            }
            if(money>wealth){
                wealth = money;
            }
        }
        return wealth;
    }
}