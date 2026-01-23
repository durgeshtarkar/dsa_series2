class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>  res = new ArrayList<>();
         Arrays.sort(nums);
        findSubset(nums,0,new ArrayList<>(),res);
        return res;
        
    }
    private void findSubset(int[] nums, int index,List<Integer> sublist,     List<List<Integer>>  res){
        if(index== nums.length){
            res.add(new ArrayList<>(sublist));
            return;
        }
        sublist.add(nums[index]);
        findSubset(nums,index+1,sublist,res);
        sublist.remove(sublist.size()-1);

        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
             index++;
        }
        findSubset(nums,index+1,sublist,res);
    }
}