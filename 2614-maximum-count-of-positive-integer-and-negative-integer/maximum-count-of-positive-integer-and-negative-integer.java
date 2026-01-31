class Solution {
    public int maximumCount(int[] nums) {
        int countNeg = 0;
        int countPos = 0;
        int max = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 0){
                countPos++;
            }
            if(nums[i] < 0){
                countNeg++;
            }
        }
        max = Math.max(countPos,countNeg);
        return max;

    }
}