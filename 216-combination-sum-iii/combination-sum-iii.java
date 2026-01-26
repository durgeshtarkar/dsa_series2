class Solution {
    private void subfunct(int[] candidates , int start, int k, int n ,List<Integer> sublist ,List<List<Integer>> res){
            if( n < 0) return;
            if(k==0){
                if(n == 0){
                res.add(new ArrayList<>(sublist));
                }
                return;
            }
            for(int i = start ; i < candidates.length ; i++){
                if(i > start  && candidates[i-1] == candidates[i]) continue;
                if(candidates[i] > n) break;
                
                sublist.add(candidates[i]);
                subfunct(candidates , i+1 ,k-1, n - candidates[i] , sublist , res);
                sublist.remove(sublist.size()-1);
            }

        
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] candidates = {1 , 2, 3, 4, 5, 6, 7, 8, 9};
        List<List<Integer>> res = new ArrayList<>();
        subfunct(candidates ,0,k,n,new ArrayList<>() , res);

        return res;

    }
}