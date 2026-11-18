class Solution {
    public int minChanges(String s) {
        int changes = 0;
        int moveIndex = 0;
        while(moveIndex < s.length()){
            if((moveIndex + 1)< s.length() && s.charAt(moveIndex) != s.charAt(moveIndex + 1)){
                changes++;
                moveIndex += 2;
            }
            if((moveIndex + 1)< s.length() && s.charAt(moveIndex) == s.charAt(moveIndex + 1)){
                moveIndex +=2;
            }

        }
        return changes;
    }
}