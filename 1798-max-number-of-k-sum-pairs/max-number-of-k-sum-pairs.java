class Solution {
    public int maxOperations(int[] nums, int k) {
        int start = 0;
        int end = nums.length-1;
        int sum = 0;
        int count = 0;
        Arrays.sort(nums);
        while(start < end){
            sum = nums[start] + nums[end];
            if(sum == k){
                count++;
                start++;
                end--;
            }else if(sum > k){
               end--;
            }else{
                start++;
            }
        }
        return count;

    }
}