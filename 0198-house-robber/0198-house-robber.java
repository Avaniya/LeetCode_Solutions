class Solution {
    public int rob(int[] nums) {
        int prevnorob=0;
        int prevrob=0;
        for(int curr:nums){
            int temp=Math.max(prevnorob,prevrob);
            prevrob=prevnorob+curr;
            prevnorob=temp;
        }
        return Math.max(prevrob,prevnorob);
    }
}