class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max=0;
        for(int x:map.values()){
            max=Math.max(max,x);
        }
        int count=0;
        for(int x:map.values()){
            if(x==max){
                count+=x;
            }
        }
        return count;
    }
}