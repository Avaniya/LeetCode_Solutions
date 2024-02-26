class Solution {
    public int missingNumber(int[] nums) {
        int total=0;
        int n=nums.length;
        int v=(n*(n+1))/2;
        for(int c:nums){
            total+=c;
        }
        return v-total;
    }
}