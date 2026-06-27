class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int employee = 0;  // for counting the number of employees working atleast target
        for(int i=0; i<hours.length;i++){  // iterating through hours array
            if(hours[i] >= target){   // checking if the current value is greater than the target
                employee++;
            }
            else{
                continue;
            }
        }
        return employee;
    }
}