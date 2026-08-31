class Solution {
    static boolean compareFreq(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()){
            return false;      // basic check of the length of the input strings
        }

        int[] count1 = new int[26];
        for(int i = 0; i < s1.length() ; i++ ){        // creating the freq table for the string 1 
            char ch = s1.charAt(i);
            int index = ch - 'a';
            count1[index]++;       // updating the frequency of the characters of string 1
        }

        int i = 0;
        int windowLength = s1.length();    // creating a window of the length of the string 1 
        int[] count2 = new int[26];
        for(i = 0; i< windowLength ; i++){
            char ch = s2.charAt(i);
            int index = ch - 'a';
            count2[index]++;         // updating the frequency of the characters at initial window of the length of string 2
        } 

        if(compareFreq(count1 , count2) == true){
            return true;       // if all the frequecy table are same then return true else check for the remaining window 
        }
        else{
            while(i < s2.length()){
                // add new character to the count2 table and its frequency
                char newChar = s2.charAt(i);
                int newCharIndex = newChar - 'a';
                count2[newCharIndex]++;
                // remove the oldCharacter frequency from the count2 table as we move further character by character in the string 2
                int oldCharIndex = i - windowLength;   // index of the old character in the string 2
                char oldChar = s2.charAt(oldCharIndex);    // this is the old character
                int freqTableIndexOfOldChar = oldChar - 'a';   // this is the index of the old character in the count2 freq table which we need to remove 
                count2[freqTableIndexOfOldChar]--;    // removing the frequency of the old character from the table count2
              
              // compare the updated case i.e, after adding the newchar freq and removing the old char freq, if the frequency table are same, if yes then return true
                if(compareFreq(count1 , count2) == true){
                    return true;
                }
                  // update i
                i++;
            }

        }
        return false;

    }
}