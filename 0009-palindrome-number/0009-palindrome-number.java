class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int n=x;
        while(n>0){
            int temp=n%10;
            reverse=reverse*10+temp;
            n/=10;
        }
        return (reverse==x);
        
    }
}