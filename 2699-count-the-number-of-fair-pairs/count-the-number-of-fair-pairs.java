class Solution {
    private long countPairs(int[] nums, int bound){
        int start = 0;
        int end = nums.length -1;
        long count =0;
        while(start < end){
            if(nums[start] + nums[end]<= bound){
            count+= (end - start);
            start++;
            }else{
            end--;
        }
       }
       return count;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
      Arrays.sort(nums);
      return countPairs(nums,upper) - countPairs(nums,lower-1);
    }
}