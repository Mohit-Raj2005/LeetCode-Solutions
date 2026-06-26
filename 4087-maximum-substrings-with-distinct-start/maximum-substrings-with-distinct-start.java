class Solution {
    public int maxDistinct(String s) {
        HashMap<Character , Integer> answer = new HashMap<>();  // intialising a hashmap to store each character of string and its occurence
        for(int i = 0; i<s.length(); i++){
            answer.put(s.charAt(i),answer.getOrDefault(s.charAt(i),0)+1); // putting each character and updating its value
        }
        return answer.size(); // returning the size of the answer hashmap
    }
}