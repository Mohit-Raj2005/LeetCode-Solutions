class Solution {
    public int totalNumbers(int[] digits) {
        // HashSet<Integer> setEven = new HashSet<>();
        // HashSet<Integer> setOdd = new HashSet<>();
        // int validFirst = 0;
        // for(int i = 0; i < digits.length ; i++){
        //     if(digits[i] != 0){
        //         validFirst++;
        //     }
            
        //     if(digits[i] % 2 == 0){
        //         setEven.add(digits[i]);   
        //     }
        //     else{
        //         setOdd.add(digits[i]);
        //     }
           
        // }
        // int evenCount = setEven.size();
        // if(setOdd.size() == 0 && setEven.size() == 1 ){
        //     return 1;
        // }
        
        // return (validFirst-1) * (digits.length - 2) * evenCount;
        // // return ( evenCount--)*((validFirst--)-1) * ( (validFirst)-evenCount) ;



        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i <digits.length; i++){
            if(digits[i] % 2 == 0){          // loop for determining the last digit of the number || digit should be even or i is even digit index
                for(int j = 0; j < digits.length ;j++){
                    if(j != i && digits[j] != 0){               // loop for determining the first digit of the number  || mid digit should not be 0 and the first i (even number) and j (first digit) should not be same or excluding that index which is used in the last digit
                        for(int k = 0; k < digits.length; k++){
                            if(k != j && k != i){                   // loop for determing the mid digit of the number || mid digit can be anything but it should not be the i and j index element as it is already used
                                int ans = digits[j] * 100 + digits[k] * 10 + digits[i];
                                set.add(ans);
                            }
                        }
                    }
                }
            }
        }
        return set.size();
    }
}