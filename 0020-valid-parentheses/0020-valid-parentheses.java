class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<Character>();
        for(Character ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else if(stack.isEmpty()|| !match(stack.pop(),ch)){
                return false;
            }
        }
        return stack.isEmpty();
    }
    private boolean match(Character r,Character l){
        return (r=='(' && l==')')|| (r=='{'&&l=='}')||(r=='['&& l==']');
    }
}