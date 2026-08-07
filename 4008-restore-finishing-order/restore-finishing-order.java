class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int ans[] = new int[friends.length];
        ArrayList<Integer> friend = new ArrayList<>();
        for(int i = 0; i< friends.length ; i++){
            friend.add(friends[i]);
        }
        int k = 0;
        for(int i = 0; i<order.length ; i++){
            if(friend.contains(order[i])){
                ans[k++] = order[i];
            }
        }
        return ans;
    }
}