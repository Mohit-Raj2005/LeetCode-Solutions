class Solution {
    public int mySqrt(int x) {
        int start = 1;   // the sqrt will lie after 0, so starting with 0
        int end = x;  //  the sqrt will be less then x/2 , so ending with x/2 or we can say that the sqrt will lie from 0 to x or 0 to x/2
        int ans = -1;

        if(x==0){    // handiling 0 input case separately so that we don't get 0 division error in the binary search
            return 0;
        }

        else{
        while(start <= end){   
            // applying binary search to find the sqrt
            int mid = start + (end - start)/2;
            // if(mid*mid == x){   // if mid element is the sqrt
            //     ans = mid ;       // mid*mid is overflowing the range of integer so we can modify the condition as mid == x/mid to prevent the overflow condition
            // }
            if(mid == x/mid){
                ans = mid;
            }
             if(mid > x/mid){    // if square of mid is greater than x
                end = mid -1;   // then moving left to check the sqrt
            }
            else{
                //if square of mid is greater than or equal to the mid
                ans = mid ;   // storing the mid as possible ans  
                start = mid +1;  // moving right to check further sqrts
            }
        }
        }

        // //calculating till precission   just for understanding and not to do with the solution of this problem
        // double factor = 1;
        // for(int i =0; i<3;i++){
        //     factor = factor /10;
        //      for(int i = 0; i<10;i++){
        //     int newans = ans + factor;
        //     if(newans*newans == x){
        //         return newans;
        //     }
        //      else if(newans*newans < x){
        //          ans = newans;
        //            }
        //     else{
        //         break;
        //     }
        //    }
            
        // }

        return ans;
    }
}