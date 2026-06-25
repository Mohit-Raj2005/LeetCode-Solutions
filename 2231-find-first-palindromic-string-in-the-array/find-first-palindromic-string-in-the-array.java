class Solution {
    public String firstPalindrome(String[] words) {
        String ans = ""; // variable to store the ans string
        for(int i =0; i< words.length; i++){
            String rev = "";   // rev variable to store reverse string
            for(int j = words[i].length()-1;j>=0 ; j--){
               rev = rev + words[i].charAt(j);   // backward iterating each character in the word in the current iterarion and adding it to the reverrse string 
            }
            if(rev.equals(words[i])){   // comparing rev and the current word or checking palindrome
                ans = ans + rev;  // storing the rev in ans if both are equal
                break;
            }
            else{
                continue;
            }
        }
        return ans;
    }
}