class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int max=0,score=0,l=0,h=tokens.length-1;
        while(l<=h){
            if(power>=tokens[l]){
                score++;
                power-=tokens[l++];
                max=Math.max(max,score);
            }
            else if(score>0){
                score--;
                power+=tokens[h--];
            }
            else{
                break;
            }
        }
        

        return max;
    }
}