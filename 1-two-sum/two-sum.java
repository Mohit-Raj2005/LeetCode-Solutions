class Solution {
    //This solution will have runtime complexity of O(n)
    //this is a more efficient method of solving this problem other than having a brute force method
    public int[] twoSum(int[] nums, int target) {
        int [] finalarr=new int[2];
      int x;
      int y;
    
      HashMap<Integer,Integer> Nums=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        Nums.put(nums[i],i);
      }
      for(int j=0;j<nums.length;j++){
        x=nums[j];
        y=target-x;
        if(Nums.get(y)!=null && Nums.get(y)!=j){
                finalarr[1]=j;
                finalarr[0]=Nums.get(y);
        }
     
       
      }
     return finalarr;
          
    }

}
// class Solution {
//     //this is a brute force method with O(n2) runtime complexity
//     public int[] twoSum(int[] nums, int target) {
//         int [] finalarr=new int[2];
//       for(int i=0;i<nums.length;i++){
//         for(int j=i+1;j<nums.length;j++){   
//             if(nums[i]+nums[j]==target){   //adding each element with the next element and then comparing it with the target
//                 finalarr[0]=i;
//                 finalarr[1]=j;
//             }

//         }
//       }
//       return finalarr;
      
//     }
// }

    
    
