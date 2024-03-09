class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       int one=0,two=0;
       while(one<nums1.length && two<nums2.length){
           if(nums1[one]==nums2[two]){
               return nums1[one];
           }
           else if(nums1[one]<nums2[two]){
               one++;
           }
           else{
               two++;
           }
       }
       return -1;
    }
}