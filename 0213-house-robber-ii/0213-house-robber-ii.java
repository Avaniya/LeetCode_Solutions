class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        return Math.max(rob(nums,0,nums.length-2),rob(nums,1,nums.length-1));
    }
    private int rob(int[] nums, int left, int right){
        int prevnorob=0;
        int prevrob=0;
        for(int i=left;i<=right;i++){
            int temp=Math.max(prevnorob,prevrob);
            prevrob=prevnorob+nums[i];
            prevnorob=temp;
        }
        return Math.max(prevnorob,prevrob);
    }
}