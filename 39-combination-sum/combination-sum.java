class Solution {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        combinationSum(candidates , 0, target,new ArrayList<>(),res);
        return res;
    }
    private void combinationSum(int[] candidates,int index , int target,  List<Integer> sublist , List<List<Integer>> res){
        if(target < 0) return;
        if(index == candidates.length){
            if(target==0){
                res.add(new ArrayList<>(sublist));
            }
            return;
        }
        //pick
        sublist.add(candidates[index]);
        combinationSum(candidates , index , target - candidates[index],sublist ,res);
        sublist.remove(sublist.size()-1);
         
         // not pick
         combinationSum(candidates , index+1 , target , sublist , res);

    }
}