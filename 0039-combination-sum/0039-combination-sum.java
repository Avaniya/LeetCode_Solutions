class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();

        makeComb(candidates,target,0,new ArrayList<>(),0,res);
        return res;
    }
    private void makeComb(int[] candidates, int target, int ind,List<Integer> comb,int total, List<List<Integer>> res){
        if(total==target){
            res.add(new ArrayList<>(comb));
            return;
        }

        if(total>target || ind>=candidates.length){
            return;
        }

        comb.add(candidates[ind]);
        makeComb(candidates, target, ind, comb, total+candidates[ind],res);
        comb.remove(comb.size()-1);
        makeComb(candidates, target, ind+1,comb, total,res);
    }
}