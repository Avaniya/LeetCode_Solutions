class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            String st=details[i].substring(11,13);
            int n=Integer.parseInt(st);
         
            if(n>60){
                count++;
            }
        }
        return count;
    }
}