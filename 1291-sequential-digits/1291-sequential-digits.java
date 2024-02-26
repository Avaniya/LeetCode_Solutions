class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> num=new ArrayList<>();

        for(int start=1;start<9;start++){
            int number=start;
            for(int next=start+1;next<=9;next++){
                number=number*10+next;
                if(number>=low && number<=high){
                    num.add(number);
                }
            }
        }Collections.sort(num);
        return num;
    }
}