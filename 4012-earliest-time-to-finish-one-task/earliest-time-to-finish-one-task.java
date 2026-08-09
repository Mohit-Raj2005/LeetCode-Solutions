class Solution {
    public int earliestTime(int[][] tasks) {
        int[] finished = new int[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            int tempSum = 0;
            for (int j = 0; j < tasks[0].length; j++) {
                tempSum += tasks[i][j];
            }
            finished[i] = tempSum;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < finished.length; i++) {
            if (finished[i] < min) {
                min = finished[i];
            }
        }
        return min;
    }
}