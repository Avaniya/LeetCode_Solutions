class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        List<String> words=new ArrayList<String>(Arrays.asList(str));
        Collections.reverse(words);
        String string=String.join(" ",words);
        return string;
    }
}