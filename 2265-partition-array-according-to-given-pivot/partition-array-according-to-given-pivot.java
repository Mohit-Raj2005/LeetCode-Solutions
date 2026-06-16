class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> lessPivot = new ArrayList<>();
        ArrayList<Integer> inputPivot = new ArrayList<>();
        ArrayList<Integer> morePivot = new ArrayList<>();
        ArrayList<Integer> finalresult = new ArrayList<>();
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            if(nums[i]<pivot){
                lessPivot.add(nums[i]);
            }
            else if(nums[i]>pivot){
                morePivot.add(nums[i]);
            }
            else{
                inputPivot.add(nums[i]);
            }
        }
        finalresult.addAll(lessPivot);
        finalresult.addAll(inputPivot);
        finalresult.addAll(morePivot);
        for(int i=0; i<finalresult.size();i++){
            result[i] = finalresult.get(i);
        }
        
         return result;
    }
}