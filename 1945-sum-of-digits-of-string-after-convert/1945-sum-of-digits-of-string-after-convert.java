class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            str.append(s.charAt(i)-'a'+1);
        }
       
       while(k>0){
            int temp=0;
            for(char x: str.toString().toCharArray()){
                temp+=x-'0';
            }
            str = new StringBuilder(String.valueOf(temp));
            k--;
        }
        return Integer.parseInt(str.toString());
    }
}