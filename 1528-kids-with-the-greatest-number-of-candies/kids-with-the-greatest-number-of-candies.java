class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        ArrayList<Integer> Candies = new ArrayList<>();
        for(int i = 0; i<candies.length ; i++){
            Candies.add(candies[i]);
        }
        for(int i = 0; i<candies.length ; i++){
            if(candies[i] + extraCandies >= Collections.max(Candies)){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}