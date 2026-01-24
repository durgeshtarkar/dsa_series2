class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int MOD = 1_000_000_007;
        int[] pow2 = new int[n];
        pow2[0] = 1;
        for(int i = 1 ; i < nums.length ; i++){
            pow2[i] = (int)((pow2[i-1] * 2L)% MOD);    
        }

        
        int count = 0;
        int l = 0;
        int r = nums.length - 1;
        while(l <= r){
            if(nums[l]+nums[r] <= target){
                count = (count + pow2[r-l])%MOD;
                l++;
            }else{
                r--;
            }
            
        }
        
        return (int)count;
    }
}