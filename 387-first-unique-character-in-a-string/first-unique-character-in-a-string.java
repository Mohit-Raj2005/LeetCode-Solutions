class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> mapp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char p = s.charAt(i);
            mapp.put(p,mapp.getOrDefault(p,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char p = s.charAt(i);
            if(mapp.get(p)<2){
                return i;
            }
        }
        return -1;
    }
}