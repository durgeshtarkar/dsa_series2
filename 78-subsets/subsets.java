class Solution {
    List<List<Integer>> res = new ArrayList<>();
    private void findSubsets(int[] nums, int index,List<Integer> sublist ){
        if(index== nums.length){
            res.add(new ArrayList<>(sublist));
            return;
        }
        //pick
        sublist.add(nums[index]);
        findSubsets(nums, index+1 ,sublist);
        sublist.remove(sublist.size()-1);
        // not pick
        findSubsets(nums, index+1 ,sublist);
    }
    public List<List<Integer>> subsets(int[] nums) {
        findSubsets(nums,0,new ArrayList<>());
         return res;    
    }

    
}