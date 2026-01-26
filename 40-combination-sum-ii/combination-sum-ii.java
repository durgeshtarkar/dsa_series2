class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        combinationSum(candidates , 0, target,new ArrayList<>(),res);
        return res;
    }
     private void combinationSum(int[] candidates,int start , int target,  List<Integer> sublist , List<List<Integer>> res){
        if(target < 0) return;  // prevent from negative
            if(target==0){
                    res.add(new ArrayList<>(sublist));
                return;
            }
            
        //pick
        for(int i = start ; i < candidates.length ; i++){
            if(candidates[i] > target) break;
            if(i > start && candidates[i-1] == candidates[i]) continue;
            sublist.add(candidates[i]);
            combinationSum(candidates , i+1 , target - candidates[i],sublist , res);
            sublist.remove(sublist.size()-1);// backtrack
         
        }
         
        }
}