class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10){
            return false;
        }
        else{
            int currentRemove = 10;
            int index = 0;
            for(int i = 1; i <= 10; i++){
                n = n - currentRemove;
                currentRemove = currentRemove - 1;
                if( currentRemove > n){
                    index = i;
                    break;
                }
                
            }
            if(index % 2 != 0){
                return true;
            }
            else{
                return false;
            }
            
        }

    }
}