class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length/2;i++){
            char j=ch[i];
            ch[i]=ch[ch.length-1-i];
            ch[ch.length-1-i]=j;
        }
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]=='1'){
                ch[i]='0';
                ch[ch.length-1]='1';
                break;
            }
        }
        return new String(ch);
    }
}