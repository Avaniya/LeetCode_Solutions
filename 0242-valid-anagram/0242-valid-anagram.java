class Solution {
    public boolean isAnagram(String s, String t) {
        boolean f;
        if(s.length()==t.length()){
            char[] ss=s.toCharArray();
            char[] tt=t.toCharArray();
            Arrays.sort(ss);
            Arrays.sort(tt);
            f=Arrays.equals(ss,tt);
        
            return f;
        }
        else
            return false;
    }
}